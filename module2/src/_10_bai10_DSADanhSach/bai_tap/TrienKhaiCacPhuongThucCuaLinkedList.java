package _10_bai10_DSADanhSach.bai_tap;

 class MyLinkedList1<E> {
    private static int numNodes=0;
    private static Node head;

    private static class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }

    public MyLinkedList1(){

    }
    public  void addFirst(E element){
        Node temp= head;
        head =new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
    public void add(int index, E element){
        Node temp= head;
        Node holder ;
        for(int i=0; i<index-1&& temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next= new Node(element);
        temp.next.next=holder;
        numNodes++;
    }
    public Object get(int index){
        Node temp =head;
       for(int i=0; i<index;i++){
           temp=temp.next;
       }
       return temp.data;

    }
    public int getSize(){
        return numNodes;
    }
    public E remove (int index){
        if(index<0||index>numNodes){
            throw new IllegalArgumentException("Error index: " +index);
        }
        Node temp =head;
        Object data;
        if(index==0){
            data=temp.data;
            head=head.next;
            numNodes--;
        }else{
            for(int i=0;i<index-1&&temp.next!=null;i++){
                temp =temp.next;
            }
            data = temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element){
        if(head.data.equals(element)){
            remove(0);
            return true;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.equals(element)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }
    public  MyLinkedList1<E> cloneLinkedList(){
        if(numNodes==0){
            throw new NullPointerException("LinkedList này null");

        }
        MyLinkedList1<E> returnLinkedList = new MyLinkedList1<>();
        Node temp =head;
        returnLinkedList.addFirst((E) temp.data);
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E) temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }
    public boolean constains (E element){
        Node temp=head;
        while (temp.next!=null){
            if(temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        return false;

    }
    public int indexOFF(E element){
        Node temp=head;
        for(int i =0;i<numNodes;i++){
            if(temp.getData().equals(element)){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }


}

class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private String nameStudent;
            private int ageStudent;
            private String className;


            public Student(String nameStudent, int ageStudent, String className) {
                this.nameStudent = nameStudent;
                this.ageStudent = ageStudent;
                this.className = className;
            }

            public String getNameStudent() {
                return nameStudent;
            }

            public void setNameStudent(String nameStudent) {
                this.nameStudent = nameStudent;
            }

            public int getAgeStudent() {
                return ageStudent;
            }

            public void setAgeStudent(int ageStudent) {
                this.ageStudent = ageStudent;
            }

            public String getClassName() {
                return className;
            }

            public void setClassName(String className) {
                this.className = className;
            }

            public String toString() {
                return "Student (" +
                        " nameStudent = " + nameStudent +
                        " ageStudent = " + ageStudent +
                        " classStudent = " + className + " )";
            }

        }
        MyLinkedList1<Student> testLinkedList = new MyLinkedList1<>();
        Student student1 = new Student("A", 20, "C07");
        Student student2 = new Student("B", 21, "C08");
        Student student3 = new Student("C", 22, "C09");
        Student student4 = new Student("D", 23, "A01");
        Student student5 = new Student("E", 24, "A02");
        testLinkedList.addFirst(student1);
        testLinkedList.addFirst(student2);
        testLinkedList.addLast(student3);
        testLinkedList.add(3,student4);
        System.out.println( testLinkedList.indexOFF(student1));

//        for(int i=0;i<testLinkedList.getSize();i++){
//            Student student = (Student)testLinkedList.get(i);
//            System.out.println(student.getNameStudent());
//        }


    }
}