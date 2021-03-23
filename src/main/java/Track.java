public class Track implements Difficulty{
    private int length;
    public Track(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String info() {
        return "track";
    }
}