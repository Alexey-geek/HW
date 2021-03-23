public class Human implements Entity{
    private String name;
    private int runLimit;
    private int jumpLimit;
    private boolean tired = false;
    public Human(int runLimit , int jumpLimit , String name){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    @Override
    public void overcomeDifficulty(Difficulty dif) {
        if(tired){
            return;
        }
        if(dif.info().equals("wall")){
            if(jumpLimit >= ((Wall)dif).getHigth()) {
                jump(((Wall) dif).getHigth());
            }else{
                System.out.println("Человек " + name + " не смог перепрыгнуть");
                tired = true;
            }
        }else{
            if(runLimit >= ((Track)dif).getLength()) {
                run(((Track) dif).getLength());
            }else{
                System.out.println("Человек " + name + " не смог пробежать");
                tired = true;
            }
        }
    }

    @Override
    public void jump(int higth) {
        System.out.println("Человек " + name + " прыгнул на " + higth + " метра");
    }

    @Override
    public void run(int length) {
        System.out.println("Человек " + name + " пробежал " + length +" метров");
    }
}