import java.util.ArrayList;

public class T2 {
    public static <A> ArrayList<A> method (A [] array){
        ArrayList<A> list = new ArrayList<>();
        for (A a:array) {
            list.add(a);
        }
        return list;
    }
    public static void main(String[] args) {
        Integer[] ints = {0 , 1 , 2 , 3 , 4 , 88};
        String[] str = {"rt" , "ytn" , "ty"};
        System.out.println(method(ints));
        System.out.println(method(str));
    }
}
