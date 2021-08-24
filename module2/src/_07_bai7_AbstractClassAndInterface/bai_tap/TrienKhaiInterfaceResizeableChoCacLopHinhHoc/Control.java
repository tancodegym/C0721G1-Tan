package _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

import _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.model.*;

import java.util.Scanner;

class RandomShape {
    public static Shape getRandom() {
        int random = (int) (Math.round(Math.random() * 4));
        switch (random) {
            case 1:
                return new Circle(3.0);
            case 2:
                return new Rectangle(5.0, 7.0);
            case 3:
                return new Triangle(2,2,2);
            default:
                return new Square(5.0);
        }
    }
}

public class Control {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of shapes");
        int numberOfShape = Integer.parseInt(input.nextLine());
        Shape[] shapes = new Shape[numberOfShape];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = RandomShape.getRandom();
        }
        System.out.println("Before Resizeable:");
        System.out.println();
        System.out.println();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle has radius : "+((Circle) shape).getRadius()+  ", area of Circle is : " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle has area : " + ((Rectangle) shape).getArea() + ", perimeter : " + ((Rectangle) shape).getPerimeter());
            }
            if (shape instanceof Square) {
                System.out.println("Square has area : "
                        + ((Square) shape).getArea()+", perimeter : "  + ((Square) shape).getPerimeter());
            }
            if(shape instanceof Triangle){
                System.out.println("Triangle has area: " + ((Triangle)shape).getArea()+", perimeter of Triangle is: " + ((Triangle)shape).getPerimeter());
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resizeable(Math.random());
            }
            if (shape instanceof Rectangle) {
                 ((Rectangle) shape).resizeable(Math.random());
            }
            if (shape instanceof Square) {
                 ((Square) shape).resizeable(Math.random());
            }
            if (shape instanceof Triangle) {
                ((Triangle) shape).resizeable(Math.random());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("After Resizeable:");
        System.out.println();
        System.out.println();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle has radius : "+((Circle) shape).getRadius()+  ", area of Circle is : " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Rectangle has area : " + ((Rectangle) shape).getArea() + ", perimeter : " + ((Rectangle) shape).getPerimeter());
            }
            if (shape instanceof Square) {
                System.out.println("Square has area : "
                        + ((Square) shape).getArea()+", perimeter : "  + ((Square) shape).getPerimeter());
            }
            if(shape instanceof Triangle){
                System.out.println("Triangle has area: " + ((Triangle)shape).getArea()+", perimeter of Triangle is: " + ((Triangle)shape).getPerimeter());
            }
        }
    }
}
