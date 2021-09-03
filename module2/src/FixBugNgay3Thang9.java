import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FixBugNgay3Thang9 {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        int num=0;
        int count=0;
        while (count<10){
            boolean flag=true;
            if (num<2){
                flag=false;
            }else {
                for (int i = 2; i <num ; i++) {
                    if(num%i==0) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    stack.push(num);
                    count++;
                }
            }
            num++;
        }
        for (int i=0;i<count; i++){
            System.out.println(stack.pop());
        }

    }
}
