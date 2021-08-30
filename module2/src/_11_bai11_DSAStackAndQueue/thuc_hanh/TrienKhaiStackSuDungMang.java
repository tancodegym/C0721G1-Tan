package _11_bai11_DSAStackAndQueue.thuc_hanh;

public class TrienKhaiStackSuDungMang {
    public static class MyStack {
        private int arr[];
        private int size;
        private int index = 0;

        public MyStack(int size) {
            this.size = size;
            arr = new int[size];
        }
        public boolean isFull() {
            if (index == size) {
                return true;
            }
            return false;
        }
        public void push(int element){
            if(isFull()){
                throw new StackOverflowError("Stack is full");
            }
            arr[index] = element;
            index++;
        }
        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is null");
            }
            return arr[--index];
        }
        public int size() {
            return index;
        }
        public boolean isEmpty() {
            if (index == 0) {
                return true;
            }
            return false;
        }
    }
    static class StackClient{
        public static void main(String[] args) throws Exception {
            MyStack stacks=new MyStack(5);
            stacks.push(1);
            stacks.push(5);
            stacks.push(3);
            stacks.push(2);
            stacks.push(4);
            System.out.println("1. Size of stack after push operations: " + stacks.size());
            System.out.printf("2. Pop elements from stack : ");
            while (!stacks.isEmpty()){
                System.out.println(stacks.pop());
            }
            System.out.println("Size of stacks after pop operations: " + stacks.size());
        }
    }

}

