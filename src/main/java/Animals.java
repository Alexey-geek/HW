public class Animals {
    String name;
    void run (int meters){
        System.out.println(name + "пробежал(-а , -о)" + meters);
    }
    void swim (int meters){
        System.out.println(name + "проплыло(-а , -о)" + meters);
    }
    public Animals(String name){
        this.name = name;
    }

}
