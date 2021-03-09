import java.util.Random;
import java.util.Scanner;

public class HomeWorkGame2 {
    static Scanner sc = new Scanner(System.in);
    public static void hintGenerator(String answer , String oldHint , String userAnswer){
        String  newHint = "";
        for (int i = 0; i < Math.min(userAnswer.length() , answer.length()); i++) {
            if(userAnswer.charAt(i) == answer.charAt(i)){
                newHint += userAnswer.charAt(i);
            }else{
                newHint += oldHint.charAt(i);
            }
        }
        int length = newHint.length();
        for (int i = length; i < oldHint.length(); i++) {
            newHint += '#';
        }
        System.out.println("Подсказка : " + newHint);
    }
    public static boolean checkAnswer(String userAnswer , String answer){
        if(userAnswer.equals(answer)){
            System.out.println("Вы отгадали! Молодец!!!");
            return true;
        }else {
            System.out.println("Попробуйте еще раз!");
            return false;
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
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd = new Random();
        String answer = "", hint = "###############" , userAnswer;
        boolean newGame = true;
        while (true){
            if(newGame){
                System.out.println("Я загадал слово, сможешь отгадать?");
                answer = words[rnd.nextInt(words.length)];
                newGame = false;
            }
            userAnswer = sc.next();
            if(!checkAnswer(userAnswer , answer)) {
                hintGenerator(answer, hint, userAnswer);
            }else{
                if(again()) {
                    newGame = true;
                }else{
                    System.out.print("GG");
                    break;
                }
            }
        }
    }
}
