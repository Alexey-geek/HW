public class MyArraySizeException extends Exception{
    public MyArraySizeException(){
    }
    @Override
    public void printStackTrace() {
        System.out.println("Я хочу массив 4о4");
    }
}
