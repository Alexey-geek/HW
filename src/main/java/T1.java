import java.util.ArrayList;

public class T1 {
    public static <A> ArrayList<A> method(ArrayList <A> array , int i , int j){
        if(!(i < 0 || j < 0)) {
            A reserve1 = array.get(i);
            A reserve2 = array.get(j);
            array.remove(i);
            array.add(i, reserve2);
            array.remove(j);
            array.add(j, reserve1);
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        method(integers , 1 , 0);
        System.out.println(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("rt");
        strings.add("dg");
        method(strings , 1 , 0);
        System.out.println(strings);
    }
}
