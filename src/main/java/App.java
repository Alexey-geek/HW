public class App {
    static final int COUNT_OF_CATS = 5;
    static Cat[] cats = new Cat[COUNT_OF_CATS];
    static Plate plate = new Plate(0);
    public static void main(String[] args) {
        String[] namesOfCats = {"Барсик" , "Алиса" , "Мишель" , "Мурзик" , "Гав"};
        int[] appititesOfCats = {5 , 6 , 1 , 8 , 3};
        for (int i = 0; i < COUNT_OF_CATS; i++) {
            cats[i] = new Cat(namesOfCats[i] , appititesOfCats[i]);
        }


        plate.encreaseFood(100);
        feedCat();

        System.out.println();

        plate.setFood(0);
        plate.encreaseFood(10);//plate.setFood(10); просто проверяю метод encreaseFood()
        feedCat();
    }
    public static void feedCat(){
        for (int i = 0; i < COUNT_OF_CATS; i++) {
            cats[i].eat(plate);
            cats[i].satietyReview();
            cats[i].getHungry();
        }
    }
}

