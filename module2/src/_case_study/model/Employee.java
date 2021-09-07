package _case_study.model;

import java.time.LocalDate;

public class Employee  extends  Person{
    private String employeeCode;
    private Level level;
    private Position position;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, String idCard,
                    String phoneNumber, String email, Address address,
                    String employeeCode, Level level, Position position, int salary) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email, address);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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
                ", level=" + level +
                ", position=" + position +
                ", salary=" + salary +
                '}'+super.toString();
    }
}
class Level{
    private String level;

    public Level(String level) {
        this.level = level;
    }

    public Level() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public String toString(){
        return "Level : "+level;
    }
}
class Position{
    private String position;

    public Position() {
    }

    public Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString(){
        return "Position is: " +position;

    }
}
