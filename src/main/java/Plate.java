public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void info(){
        System.out.println("Еды в тарелке :" + food);
    }
    public boolean decreaseFood(int n){
        if(food >= n) {
            food -= n;
            return true;
        }else{
            return false;
        }
    }
    public void encreaseFood(int n){
        food += n;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}
