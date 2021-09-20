package _bai_tap_them.giai_thuat;

public class GiaiThuatNgay14Thang9 {
    public static void main(String[] args) {
        int n=9;
        int m=5;
        String s = "";
        for(int i=0;i<m;i++){
           for(int j =0;j<n;j++){
               if(i==0||i==j||j==m-1||j==n-i-1){  //i=1 ,j=9
                    s+="*";                       //i=2,j=8
               }                                   //i=3,j=7
                   else{                            //i=4,j=6
                       s+=" ";                      //i=5,j=5
               }
           }
           s+="\n";
        }
        System.out.println(s);
    }}









//        int temp = 9;
//        String string = " ";
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < temp; j++) {
//                if (i == 1 && (j == 2 || j == 1 || j == 4 || j == 5)) {
//                    System.out.print(" ");
//                } else if (i == 2 && (j == 1 || j == 3)) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            temp = temp - 2;
//
//            System.out.println("");
//            System.out.print(string);
//            string = string + " ";
//
//        }
//    }}
