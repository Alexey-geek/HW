public class Task2 {
    public boolean method2(int[] mas){
        boolean has1 = false , has4 = false;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == 1){
                has1 = true;
            }
            if(mas[i] == 4){
                has4 = true;
            }
        }
        if(has1 && has4){
            return true;
        }
        return false;
    }
}
