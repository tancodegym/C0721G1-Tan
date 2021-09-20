package _bai_tap_them.test;

class test {


     static {
         System.out.println("alibaba");
     }

     static int getI(){
         return i*5;
     }
     static {
         System.out.println(getI());
         System.out.println("5");
     }

     private static int i=3;

     public static void main(String[] args) {
         System.out.println(test.i);

     }}