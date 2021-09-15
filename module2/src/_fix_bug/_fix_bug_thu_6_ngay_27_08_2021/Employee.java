package _fix_bug._fix_bug_thu_6_ngay_27_08_2021;

public class Employee extends Person {
    private int salary;
    public Employee(int salary,String name, int AGE, Address address) {
        super(name, AGE, address);
        this.salary =salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Employee move by motorbike or car");
    }
    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "salary=" + salary +
                '}';
    }

}
