package _13_bai13_ThuatToanTimKiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> maxChar=new LinkedList<>();
        LinkedList<Character> listChar = new LinkedList<>();
        System.out.println("Enter String");
        String string = input.nextLine();
        for(int i=0;i<string.length();i++){
            if(listChar.size()>1&&string.charAt(i)<=listChar.getLast()&&listChar.contains(string.charAt(i))){
                listChar.clear();

            }
            listChar.add(string.charAt(i));
            if(listChar.size()>maxChar.size()){
                maxChar.clear();
                maxChar.addAll(listChar);
            }
        }
        for(Character character: maxChar){
            System.out.println(character);
        }
    }
}
