package _case_study.model;

public class Employee  extends  Person{
    private String employeeCode;
    private String level;
    private String position;
    private int salary;
    public Employee() {
    }
    public Employee(String name, String dateOfBirth, String gender, String idCard,
                    String phoneNumber, String email, String address,
                    String employeeCode, String level, String position, int salary) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email, address);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}'+super.toString();
    }

    public String getEmployeeString(){
        return super.getPersonString()+","+getEmployeeCode()+","+this.level+","+this.position+","+getSalary();
    }
}
