package _07_bai7_AbstractClassAndInterface.thuc_hanh;
import java.util.Arrays;
class Circle {
    private double radius ;
    private String color;
    private Boolean filled;
    public Circle(double radius,String color,Boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    public Circle() {

    }

    public Circle(double radius) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String circleToString(){
        return "A Circle with radius"+
                getRadius()+
                ", color is "+
                getColor() +
                ", has Area " +
                getArea();
    }
}

 class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
     public ComparableCircle(double radius, String color, boolean filled) {
         super(radius,color,filled);
     }
     @Override
     public int compareTo(ComparableCircle o) {
         if (getRadius() > o.getRadius()) return 1;
         else if (getRadius() < o.getRadius()) return -1;
         else return 1;
     }
}
 class ComparableCircleTest{
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"Black" , true);
        System.out.println("Pre-sorted:");
        for(ComparableCircle circle:circles){
            System.out.println(circle.circleToString());
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle:circles){
            System.out.println(circle.circleToString());
        }
    }
}