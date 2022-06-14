package inheritance.bai_tap.bt3;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[]arr = {this.xSpeed,this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + getX() +"\n"+"y="+ getY()+"\n"  +  "xSpeed=" + xSpeed +"\n"+
                    " ySpeed=" + ySpeed +
                   '}';
    }

    public MoveablePoint move (){
        setX( getX()+ xSpeed);
        setY( getY()+ ySpeed);
        return this;
    }

}
