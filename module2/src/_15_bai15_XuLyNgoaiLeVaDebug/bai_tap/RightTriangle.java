package _15_bai15_XuLyNgoaiLeVaDebug.bai_tap;

class RightTriangle {
    public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
        boolean checkSide1 = side1 < 0;
        boolean checkSide2 = side2 < 0;
        boolean checkSide3 = side3 < 0;
        if (checkSide1 || checkSide2 || checkSide3)
            throw new IllegalRightTriangleException("Side must be over than 0!");
        else {
            if (side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2) {
                throw new IllegalRightTriangleException("The sum of two sides is less than the other side!!");
            } else {
                System.out.println("A triangle with 3 side: " +
                        " side 1 = " + side1 +
                        ", side 2 = " + side2 +
                        ", side 3 = " + side3 +
                        " is a right triangle ");
            }
        }
    }
}


