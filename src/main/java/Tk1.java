import java.util.ArrayList;
import java.util.HashMap;

public class Tk1 {
    public static void main(String[] args) {
        String[] strings = {"корова", "зной", "лакомство", "еда", "еда", "еда", "зной",
                "трава", "гной", "перегной", "корова", "лакомство", "еда", "хвоя", "лес"
                , "ствол", "лес", "корова", "массив", "щавель"};
        HashMap<String , Integer> map = new HashMap<>();
        ArrayList<String> universalElements = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (!map.containsKey(strings[i])){
                map.put(strings[i] , 0);
            }
            map.put(strings[i] , map.get(strings[i])+1);
        }
        map.forEach((key , value) ->{
            System.out.println("Элемент " +key + " встречается " + value + " раз(-а)");
            if(value == 1){
                universalElements.add(key);
            }
        });
        //Это можно считать за линейную реализацию?
        System.out.print("Универсальные элементы : " + universalElements);
    }
}
