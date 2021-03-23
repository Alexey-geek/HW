public class App2 {
    public static void main(String[] args) {
        Entity[] entities = {new Human(50 , 1 , "Джек") ,
                new Cat(100 , 6 , "Барсик") ,
                new Robot(Integer.MAX_VALUE , 0 , "Чаппи") ,
                new Human(150 , 1 , "Леха")};
        Difficulty[] difficulties = {new Track(50) , new Wall(1) , new Track(100) ,
                new Wall(6) , new Track(150)};
        for (int i = 0; i < difficulties.length; i++) {
            for (int j = 0; j < entities.length; j++) {
                entities[j].overcomeDifficulty(difficulties[i]);
            }
        }
    }
}