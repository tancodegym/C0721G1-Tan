package _15_bai15_XuLyNgoaiLeVaDebug.bai_tap;

import java.util.Scanner;
  class RightTriangle {
        public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
            boolean checkSide1= side1<0||side1>=side2+side3;
            boolean checkSide2= side2<0||side2>=side1+side3;
            boolean checkSide3= side3<0||side3>=side1+side2;
            if (checkSide1||checkSide2||checkSide3)
                throw new IllegalRightTriangleException("Not a triangle");
            else {

                System.out.println("A triangle with 3 side: "+
                        " side 1 = " +side1+
                        ", side 2 = " +side2+
                        ", side 3 = " +side3+
                         " is a right triangle ");

            }
        }
    }

     class IllegalRightTriangleException extends Exception {
        String errorMessage;

        public IllegalRightTriangleException(String inErrorMessage) {
            errorMessage = inErrorMessage;
        }

        public String getString() {
            return "One of the three sides is a negative number or the sum of two sides is less than the other side!! ";
        }
    }


      class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter size 1 of triangle:");
            int side1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter size 2 of triangle:");
            int side2 = Integer.parseInt(input.nextLine());
            System.out.println("Enter size 3 of triangle:");
            int side3 = Integer.parseInt(input.nextLine());

            try {
                RightTriangle r = new RightTriangle(side1, side2, side3);
                System.out.println();
            } catch (IllegalRightTriangleException e) {
                System.err.println(e.getString());
            }

        }
    }


