package _04_bai4_ClassAndObject.thuchanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static class Rectangle {
        double width,height;

        public  Rectangle(double width, double height){
            this.width =width;
            this.height=height;
        }
        public  double getArea(){
            return this.width*this.height;
        }
        public double getPerimeter(){
            return (this.width + this.height)*2;
        }
        public String display(){
            return "Rectangle{"+" width= "+width+", height= " +height + "}";
        }
    }
    public static class Main{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = Double.parseDouble(input.nextLine());
            System.out.print("Enter the height:");
            double height = Double.parseDouble(input.nextLine());
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Your Rectangle \n"+ rectangle.display());
            System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle.getArea());

        }
    }
}
