package _06_bai6_Inheritance.bai_tap;
class Circle {
    private double radius ;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public Circle() {

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
class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.circleToString());

        circle = new Circle(5.5, "blue");
        System.out.println(circle.circleToString());

         circle = new Circle(3.5, "red");
        System.out.println(circle.circleToString());
    }
}
class Cylinder extends Circle{
        private double height;
    public Cylinder(){

    }
        public Cylinder(double radius,String color,double height){
            super(radius,color);
            this.height=height;
        }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
            return getArea()*getHeight();
    }
    @Override
    public String circleToString(){
        return "A cylinder with" +
        super.circleToString() +
                ", has Volume " +
        getVolume();
    }
}
class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.circleToString());

        cylinder = new Cylinder(5.5, "blue",10.5);
        System.out.println(cylinder.circleToString());

        cylinder = new Cylinder(3.5, "red",5.1);
        System.out.println(cylinder.circleToString());
    }
}
