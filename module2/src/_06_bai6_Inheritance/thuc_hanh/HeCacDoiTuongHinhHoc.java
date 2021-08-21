package _06_bai6_Inheritance.thuc_hanh;


class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.shapeToString());

        shape = new Shape("red", false);
        System.out.println(shape.shapeToString());

    }
}

 class Shape {
    private String color = "green";
    private Boolean filled = true;

    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String shapeToString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? " filled" : " not filled");
    }
}
class Circle extends Shape{
    private double radius =1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle (double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
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
    public double perimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String shapeToString(){
        return "A Circle with radius"+
                getRadius()+
                ", which is a subclass of "+
                 super.shapeToString();
    }
}
class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.shapeToString());

        circle = new Circle(3.5);
        System.out.println(circle.shapeToString());

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle.shapeToString());
    }
}
class Rectangle extends Shape{
    private double width=1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color, Boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }
    @Override
       public String shapeToString(){
        return "A Rectangle with width = "
                + getWidth()
                + " and length ="
                + getLength()
                + ", which is a subclass of "
                + super.shapeToString();
    }

}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.shapeToString());

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle.shapeToString());

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle.shapeToString());
    }
}
class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String shapeToString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.shapeToString();
    }
}
class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.shapeToString());

        square = new Square(2.3);
        System.out.println(square.shapeToString());

        square = new Square(5.8, "yellow", true);
        System.out.println(square.shapeToString());
    }
}
