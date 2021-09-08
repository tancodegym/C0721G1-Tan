package _15_bai15_XuLyNgoaiLeVaDebug.bai_tap;

import java.util.Scanner;


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


