import java.util.Random;
import java.util.Scanner;

public class HomeWorkGame1 {
    static Scanner sc = new Scanner(System.in);
    public static final int numOfTrys = 3;
    public static void main(String[] args) {
        Random rnd = new Random();
        int answer;
        while(true){
            answer = rnd.nextInt(10);
            guessing(answer);
            if(!again()){
                break;
            }
        }
        System.out.print("GG");
    }
    public static void guessing (int answer){
        int userAnswer;
        boolean victory = false;
        for (int i = 0; i < numOfTrys; i++) {
            System.out.println("Введите число : ");
            userAnswer = sc.nextInt();
            if (userAnswer == answer) {
                System.out.println("Вы отгадали!");
                victory = true;
                break;
            }else if(userAnswer > answer){
                System.out.println("Ваше число слишком большое!");
            }else{
                System.out.println("Ваше число слишком маленькое!");
            }
        }
        if(!victory) {
            System.out.println("Вы проиграли!");
        }
    }
    public static boolean again (){
        int flag;
        do {
            System.out.println("Хотите сыграть еще(да - 1 , нет - 0)");
            flag = sc.nextInt();
            switch (flag){
                case 0:
                    return false;
                case 1:
                    return true;
            }
        }while (true);
    }
}
