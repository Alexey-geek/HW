public class Tk2 {
    public static void main(String[] args) {
        TelephoneList tl = new TelephoneList();
        tl.add("васечкин", "8900236745546");
        tl.add("петров", "+75678990456");
        tl.add("петров", "+78906445675");
        System.out.println(tl.get("васечкин") + " " + tl.get("петров"));
    }
}
