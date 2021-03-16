public class Cat extends Animals{
    int runLimit = 200;
    int swimLimit = 0;
    void run (int meters){
        if (runLimit < meters){
            System.out.println("Не мучай " + name);
        }else {
            System.out.println("Кот " + name + " пробежал " + meters);
        }
    }
    void swim (int meters){
        if (swimLimit < meters){
            System.out.println("Кот не умеет плавать ,дурак - простак ");
        }else {
            System.out.println("Кот " + name + " проплыл " + meters);//лол)
        }
    }
    public Cat(String name){
        super(name);
    }
}
