package inheritance.bai_tap.bt2;

public class Point3d extends Ponit2d {
    float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
  public float[] getXYZ(){
        float []arr = {getX(),getY(),getZ()};
        return arr;
  }
    @Override
    public String toString() {
        return "Point3d{" + super.toString() +
                "z=" + z +
                '}';
    }
}
