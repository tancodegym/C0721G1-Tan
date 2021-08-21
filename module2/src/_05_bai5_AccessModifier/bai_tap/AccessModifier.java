package _05_bai5_AccessModifier.bai_tap;

import java.util.Scanner;

public class AccessModifier {
    static class Circle {
        private double radius=1.0;
        private String color="red";
        Circle(){

        }
        Circle(double r){
            this.radius=r;
        }
        protected   double getRadius(){
            return  this.radius;
        }
        protected double getArea(){
            return this.radius*this.radius*Math.PI;
        }

    }

}
 class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of radius: ");
        double r=Double.parseDouble(input.nextLine());
        AccessModifier.Circle circle= new AccessModifier.Circle(r);
        double area = circle.getArea();
        System.out.println("Area of circle is: " +area);
        System.out.println("Radius of circle is: " +circle.getRadius());
    }

}