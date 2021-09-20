package _exam_module2.model;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String personCode, String personName,
                   String personDateOfBirth, String personGender, String personPhone) {
        super(personCode, personName, personDateOfBirth, personGender, personPhone);
    }

    @Override
    public String toString() {
        return "Teacher is a "+
                super.toString();
    }
    public String getTeacherString(){
        return super.getPersonString();
    }
    @Override
    void show() {
        System.out.println(this.toString());
    }
}
