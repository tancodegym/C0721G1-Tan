package _06_bai6_Inheritance.bai_tap;

import java.util.Arrays;

class Point{
    private float x=0.0f;
    private float y=0.0f;
    public Point(){

    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
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

    public String pointToString() {
        return "Point with coordinates " + Arrays.toString(getXY());

    }
}
class TestPoint{
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.pointToString());
        point = new Point(5.4f,1.2f);
        System.out.println(point.pointToString());
    }
}
class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveablePoint(float x, float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MoveablePoint(){

    }
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
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
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0]=getxSpeed();
        speed[1]=getySpeed();
        return speed;
    }
    @Override
    public String pointToString(){
        return super.pointToString()+
                "speed : " +
                "( "+getxSpeed()+" , "+getySpeed()+" )";
    }
    public MoveablePoint move(){
         setX(getX()+getxSpeed());
         setY(getY()+getySpeed());
        return this;
    }
}
class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.pointToString());
        System.out.println(moveablePoint.move());

        moveablePoint=new MoveablePoint(5.3f,7.4f);
        System.out.println(moveablePoint.pointToString());
        moveablePoint.move();
        System.out.println(moveablePoint.pointToString());
    }
}