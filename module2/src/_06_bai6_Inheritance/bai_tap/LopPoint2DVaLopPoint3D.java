package _06_bai6_Inheritance.bai_tap;


import java.util.Arrays;

class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public String point2DToString() {
        return "Point2D is a point with coordinates " + Arrays.toString(getXY());

    }
}

class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.point2DToString());
        point2D = new Point2D(6.5f, 3.1f);
        System.out.println(point2D.point2DToString());
    }
}

class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ() {
     float[] array = new float[3];
     array[0]=getX();
     array[1]=getY();
     array[2]=getZ();
     return array;
    }
    @Override
    public String point2DToString() {
        return "Point3D is a point with coordinates" +Arrays.toString(getXYZ());
    }

}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.point2DToString());
        point3D = new Point3D(6.5f, 3.1f,9.5f);
        System.out.println(point3D.point2DToString());
    }
}