package _fix_bug._fix_bug_thu_6_ngay_27_08_2021;

public  class Student extends Person {
    private static String school = "Codegym";

    public Student(String name, int AGE, Address address) {
        super(name, AGE, address);
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public void howToMove() {
        System.out.println("Student move by any vehicle");
    }

    @Override
    public String toString() {
        return "Student" +super.toString() +"\nschool"+school;
    }
}
