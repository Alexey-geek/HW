public class MyArrayDataException extends Exception{
    private int i;
    private int j;
    public MyArrayDataException(int i , int j){
        this.i = i;
        this.j = j;
    }
    @Override
    public void printStackTrace() {
        System.out.println("Просили только целые числа , а в строке " + (i+1) + "  в столбце " + (j+1) +" лежит что-то другое");
    }
}