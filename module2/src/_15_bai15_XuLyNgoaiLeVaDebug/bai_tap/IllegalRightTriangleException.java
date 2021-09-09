package _15_bai15_XuLyNgoaiLeVaDebug.bai_tap;

class IllegalRightTriangleException extends Exception {
   String errorMessage;

   public IllegalRightTriangleException(String inErrorMessage) {
       errorMessage = inErrorMessage;
   }

   public String getString() {
       return this.errorMessage;
   }
}


