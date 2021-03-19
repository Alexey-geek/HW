public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name , int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate){
        satiety = plate.decreaseFood(appetite);
    }
    public void getHungry(){
        satiety = false;
    }
    public void satietyReview(){
        if(satiety) {
            System.out.println("Котейка " + name + " сыт(-a)!");
        }else {
            System.out.println("Злые люди, доброй котейке по имени " + name + " не дают еды!");
        }
    }
}
