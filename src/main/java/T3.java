public class T3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxForApples = new Box<>();
        Box<Orange> boxForOranges = new Box<>();
        boxForOranges.addFruit(orange);
        boxForOranges.addFruit(orange);
        boxForApples.addFruit(apple);
        boxForApples.addFruit(apple);
        boxForApples.addFruit(apple);
        System.out.println(boxForApples.compare(boxForOranges));
        boxForApples.addFruit(apple);
        System.out.println(boxForApples.compare(boxForOranges));
        Box boxForApples2 = new Box();
        boxForApples.transferTo(boxForApples2);
        System.out.println(boxForApples.getWeight() + " " + boxForApples2.getWeight());
    }
}
