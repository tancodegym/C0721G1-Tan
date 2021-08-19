package _05_bai5_AccessModifier.thuc_hanh;
    class Student{
        private int rollno;
        private String name;
        private static String college = "BBDIT";
        //construtor
        Student(int r, String n){
            this.rollno=r;
            this.name = n;

        }
        //Method
        static void change(){
            college = "Codegym";
        }
        void display(){
            System.out.println(rollno+" " + name + " " + college);
        }
    }
public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        //create object:
        Student s1= new Student(1, "Tran Ngoc Tan");
        Student s2 = new Student(2,"Nguyen Van A");
        Student s3 = new Student(3,"Nguyen Van B");
        //calling display method:
        s1.display();
        s2.display();
        s3.display();

    }
}
