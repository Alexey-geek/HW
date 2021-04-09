public class TwoMethods {
    public static void main(String[] args){
        TwoMethods.method1();
        TwoMethods.method2();
    }
    public static void method1(){
        int size = 10000000;
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("первый метод закончил работу за : " + (System.currentTimeMillis() - a));
    }
    public static void method2(){
        int size = 10000000 , half = size/2;
        float[] arr = new float[size] , a1 = new float[size/2] , a2 = new float[size/2];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);
        new Thread(() -> {
            for (int i = 0; i < half; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < half; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }).start();
        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);
        System.out.println("второй метод закончил работу за : " + (System.currentTimeMillis() - a));
        //А это нормально что результаты отличаются в сто раз -_-
    }
}
