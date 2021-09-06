package _case_study.model;

public class Employee  extends  Person{
    private String employeeCode;
    private Level level;
    private Position position;
    private int salary;
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
