package fix_bug_ngay_10_09_2021;

public class Teacher extends Person {
    private int salary;
    public Teacher(int salary,String name, int AGE, String address) {
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
        System.out.println("Teacher goes by motorbike");
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "salary=" + salary +
                '}';
    }
}
