package _fix_bug._fix_bug_thu_6_ngay_27_08_2021;

public class Teacher extends Person {
    private int salary;
    public Teacher(int salary,String name, int AGE, Address address) {
        super(name, AGE, address);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Teacher move by motorbike");
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "salary=" + salary +
                '}';
    }
}
