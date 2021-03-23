public class Wall implements Difficulty{
    private int higth;
    public Wall(int higth){
        this.higth = higth;
    }

    public int getHigth() {
        return higth;
    }

    @Override
    public String info() {
        return "wall";
    }
}