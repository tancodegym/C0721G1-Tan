package _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.model.*;


import java.util.Scanner;

public class RunColorable {
    static class RandomShape {
        public static Shape randomShape() {
            int random = (int) (Math.round(Math.random() * 4));
            switch (random) {
                case 1:
                    return new Circle(3.0);
                case 2:
                    return new Rectangle(5.0, 7.0);
                case 3:
                    return new Triangle(2, 2, 2);
                default:
                    return new Square(5.0);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of shapes");
        int numberOfShape = Integer.parseInt(input.nextLine());
        if (numberOfShape > 1) {
            Shape[] shapes = new Shape[numberOfShape];
            shapes[0] = new Square(10.0);
            for (int i = 1; i < shapes.length; i++) {
                shapes[i] = RandomShape.randomShape();
            }
            for (Shape shape : shapes) {
                if (shape instanceof Circle) {
                    System.out.println("Circle has area of Circle is : " + ((Circle) shape).getArea());
                }
                if (shape instanceof Rectangle) {
                    System.out.println("Rectangle has area : " + ((Rectangle) shape).getArea());
                }
                if (shape instanceof Square) {

                    System.out.println("Square has area : "
                            + ((Square) shape).getArea());
                    ((Square) shape).howToColor();
                    System.out.println();
                }
                if (shape instanceof Triangle) {
                    System.out.println("Triangle has area: " + ((Triangle) shape).getArea());
                }
            }
        }
    }
}
