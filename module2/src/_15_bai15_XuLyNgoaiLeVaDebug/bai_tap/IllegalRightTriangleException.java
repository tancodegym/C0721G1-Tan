package _15_bai15_XuLyNgoaiLeVaDebug.bai_tap;

class IllegalRightTriangleException extends Exception {
   String errorMessage;

   public IllegalRightTriangleException(String inErrorMessage) {
       errorMessage = inErrorMessage;
   }

   public String getString() {
       return "One of the three sides is a negative number or the sum of two sides is less than the other side!! ";
   }
}


