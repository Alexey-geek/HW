import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneList{
    HashMap<String , ArrayList<String>> map;
    public TelephoneList (){
        map = new HashMap<>();
    }
    public void add(String name , String telephone){
        if(!map.containsKey(name)){
            map.put(name , new ArrayList<String>());
        }
        ArrayList<String> arrayList = map.get(name);
        arrayList.add(telephone);
        map.put(name , arrayList);
    }
    public ArrayList<String> get(String name){
        return map.get(name);
    }
}