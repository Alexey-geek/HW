import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    static final int SIZE_OF_MAP = 3;
    static final char EMPTY = '.';
    static final char X = 'X';
    static final char O = 'O';
    static int COUNT_OF_MOTION = 0;
    static char[][] map = new char[SIZE_OF_MAP][SIZE_OF_MAP];
    static boolean END_OF_GAME = false;
    static boolean PLAY_AGAIN = true;
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void newMap(){
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                map[i][j] = EMPTY;
            }
        }
        printMap();
    }
    public static void humanTurn(){
        COUNT_OF_MOTION++;
        int x , y;
        do{
            do {
                System.out.println("Введите коорды хода : ");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            }while(x < 0 || x > 2 || y < 0 || y > 2);
        } while(map[y][x] != '.');
        map[y][x] = X;
    }
    public static void PCTurn(){
        COUNT_OF_MOTION++;
        if(partOfAI(O , O)){
            return;
        }else if(partOfAI(X , O)){
            return;
        }else{
            int rndDot1 , rndDot2;
            do{
                rndDot1 = rnd.nextInt(SIZE_OF_MAP);
                rndDot2 = rnd.nextInt(SIZE_OF_MAP);
            } while(map[rndDot1][rndDot2] != '.');
            map[rndDot1][rndDot2] = O;
        }
    }
    // метод ниже проверяет наличие двух похожих объектов(cheker)
    // и заполняет пустой дот c помощью другого объекта(filler)
    //и возвращает true если заполнение было осуществленно
    public static boolean partOfAI(char checker , char filler){
        int count , freeDot = 0;
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            count = 0;
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                if(map[i][j] == checker){
                    count++;
                }else{
                    freeDot = j;
                }
            }
            if(count == 2 && map[i][freeDot] == '.'){
                map[i][freeDot] = filler;
                return true;
            }
        }
        //по горизантали
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            count = 0;
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                if(map[j][i] == checker){
                    count++;
                }else{
                    freeDot = j;
                }
            }
            if(count == 2 && map[freeDot][i] == '.'){
                map[freeDot][i] = filler;
                return true;
            }
        }
        //по вертикали
        count = 0;
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            if ((map[i][i] == checker)) {
                count++;
            } else {
                freeDot = i;
            }
        }
        if (count == 2 && map[freeDot][freeDot] == '.') {
            map[freeDot][freeDot] = filler;
            return true;
        }
        //по диагонали кроме одной :(
        return false;
    }
    public static void printMap(){
        for (int i = 0; i < SIZE_OF_MAP+1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_OF_MAP+1; i++) {
            System.out.print("_ ");
        }
        System.out.println();
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void checkEnd(){
        if(checkVictory(X)){
            END_OF_GAME = true;
            System.out.println("Победили крестики");
        }else if(checkVictory(O)){
            System.out.println("Победили нолики");
            END_OF_GAME = true;
        }else if (COUNT_OF_MOTION == 9 ){
            System.out.println("Ничья");
            END_OF_GAME = true;
        }
    }
    public static boolean checkVictory(char checker){
        int count = 0;
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            count = 0;
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                if(map[i][j] == checker){
                    count++;
                }
            }
            if(count == 3){
                return true;
            }
        }
        for (int i = 0; i < SIZE_OF_MAP; i++) {
            count = 0;
            for (int j = 0; j < SIZE_OF_MAP; j++) {
                if(map[j][i] == checker){
                    count++;
                }
            }
            if(count == 3){
                return true;
            }
        }
        for (int k = 0; k <= 1; k++) {
            count = 0;
            for (int i = 0; i < SIZE_OF_MAP; i++) {
                if ((k == 0 && map[i][i] == checker) || (k == 1 && map[i][SIZE_OF_MAP - i - 1] == checker)) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    public static void again (){
        int flag;
        do {
            System.out.println("Хотите сыграть еще(да - 1 , нет - 0)");
            flag = sc.nextInt();
            if(flag == 1){
                PLAY_AGAIN = true;
                return;
            }else if (flag == 0){
                return;
            }
        }while (true);
    }
    public static void newGame () {
        PLAY_AGAIN = false;
        END_OF_GAME = false;
        System.out.println("Начнем новую игру!");
        newMap();
        COUNT_OF_MOTION = 0;
    }
    public static void main(String[] args) {
        while(!END_OF_GAME || PLAY_AGAIN) {
            if(PLAY_AGAIN){
                newGame();
            }
            humanTurn();
            printMap();
            checkEnd();
            if(!END_OF_GAME) {
                PCTurn();
                printMap();
                checkEnd();
            }
            if(END_OF_GAME){
                again();
            }
        }
        System.out.println("GG");
    }
}