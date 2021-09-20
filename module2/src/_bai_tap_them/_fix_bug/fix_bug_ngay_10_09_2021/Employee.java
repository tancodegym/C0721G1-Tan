package _bai_tap_them._fix_bug.fix_bug_ngay_10_09_2021;

public class Employee extends Person {
    private int salary;
    public Employee(int salary,String name, int AGE, String address) {
        super(name, AGE, address);
        this.salary =salary;
    }

    @Override
    public void howToMove() {
        System.out.println("Employee by motorbike or car");
    }

}
