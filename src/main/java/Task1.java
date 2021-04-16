public class Task1 {
    public int[] method1 (int[] mas){
        int index = -1;
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == 4){
                index = i;
            }
        }
        if(index == -1){
            throw new RuntimeException();
        }
        int[] out = new int[mas.length-index-1];
        for (int i = index+1; i < mas.length; i++) {
            out[i-index-1] = mas[i];
        }
        return out;
    }
}