import java.util.Scanner;

public class ExpApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Создайте массив 4о4");
        System.out.println("Введите кол-во столбцов и строчек а после элементы по порядку : ");
        String[][] mas = new String[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = sc.next();
            }
        }
        //код выше просто чтоб тестить удобно было
        /*тесты прилагаю
        4 4
        1 1 1 1
        1 1 1 1
        1 1 1 1
        1 1 1 1

        3 1
        1 2 3

        4 4
        хехе 2 2 2
        3 3 3 3
        4 4 4 4
        5 5 5 5
        */
        try {
            System.out.println("С вас за компиляцию : " + method(mas) + " рублей");
        }catch(MyArrayDataException|MyArraySizeException exception){
            exception.printStackTrace();
        }
    }
    public static int method (String [][] mas) throws MyArraySizeException , MyArrayDataException{
        int sum = 0;
        if(mas.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if(mas[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(mas[i][j]);
                }catch (NumberFormatException exception){
                    throw new MyArrayDataException(i , j);
                }
                //не ну а че можно было сразу перекинуть NumberFormatException , но раз в задании написано сделаю так
                //возможно и подругому можно было , ну и ладно
            }
        }
        return sum;
    }
}

