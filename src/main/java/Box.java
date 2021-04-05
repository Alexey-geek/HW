import java.util.ArrayList;

public class  Box <A extends Fruit>{
    private float weight;
    private ArrayList<A> list;
    public Box(){
        list = new ArrayList<>();
    }
    public float getWeight(){
        return weight;
    }
    public void addFruit(A fruit){
        list.add(fruit);
        weight += fruit.getWeight();
    }
    public boolean compare(Box box){
        if(box.getWeight() == weight){
            return true;
        }
        return false;
    }
    public void transferTo(Box<A> box){
        for (A a:list) {
            box.addFruit(a);
        }
        list.clear();
        weight = 0;
    }
}

