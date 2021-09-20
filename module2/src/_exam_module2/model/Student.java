package _exam_module2.model;

public class Student extends Person {
    private String classCode;

    public Student() {
    }

    public Student(String personCode, String personName,
                   String personDateOfBirth, String personGender, String personPhone, String classCode) {
        super(personCode, personName, personDateOfBirth, personGender, personPhone);
        this.classCode = classCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classCode='" + classCode + '\'' +
                '}'+super.toString();
    }
    public String getStudentString(){
        return super.getPersonString()+","+getClassCode();
    }

    @Override
   public void show() {
        System.out.println(super.toString());
    }
}
