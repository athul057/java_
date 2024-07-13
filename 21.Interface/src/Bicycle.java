public class Bicycle implements Vehicle{
    private int speed;

    public Bicycle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(int speed){
        this.speed+=speed;
    }
    public void applyBreak(int speed){
        this.speed-=speed;
    }
}
