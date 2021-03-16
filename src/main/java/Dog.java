public class Dog extends Animals{
    int runLimit = 500;
    int swimLimit = 10;
    void run (int meters){
        if (runLimit < meters){
            System.out.println("Не мучай " + name);
        }else {
            System.out.println("Пес " + name + " пробежал " + meters);
        }
    }
    void swim (int meters){
        if (swimLimit < meters){
            System.out.println("Не мучай " + name);
        }else {
            System.out.println("Пес " + name + " проплыл " + meters);
        }
    }
    public Dog(String name){
        super(name);
    }
}
