package inheritance.bai_tap.bt2;

public class Ponit2d {
   private float x ;
    private float y ;

    public Ponit2d() {
    }

    public Ponit2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y ){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr= {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y;
    }
}
