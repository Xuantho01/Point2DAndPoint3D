import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] array = new float[3];
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x, y);
        setXY(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(){
           array[0] = getX();
           array[1] = getY();
           array[2] = z;
    }
    public float[] getXYZ(){
        return array;
    }
    @Override
    public String toString(){
        return "Toa do 3D: "+ Arrays.toString(getXYZ());
    }
}
