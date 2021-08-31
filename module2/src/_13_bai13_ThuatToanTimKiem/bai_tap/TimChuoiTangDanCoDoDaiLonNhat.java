package _13_bai13_ThuatToanTimKiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string =input.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();
        for(int i=0;i<string.length();i++){
            LinkedList<Character> characterLinkedList = new LinkedList<>();
            characterLinkedList.add(string.charAt(i));
            for(int j=i+1;j<string.length();j++){
                if(string.charAt(j)>characterLinkedList.getLast()){
                    characterLinkedList.add(string.charAt(j));
                }

            }
            if(characterLinkedList.size()>maxString.size()){
                maxString.clear();
                maxString.addAll(characterLinkedList);
            }
            characterLinkedList.clear();

        }
        for(Character character:maxString){
            System.out.println(character);
        }

    }

}

