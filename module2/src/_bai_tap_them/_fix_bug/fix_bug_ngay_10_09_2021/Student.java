package _bai_tap_them._fix_bug.fix_bug_ngay_10_09_2021;

public  class Student extends Person {
    private static String school = "Codegym";

    public Student(String name, int AGE, String address) {
        super(name, AGE, address);
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student" +super.toString() +"\nschool= "+school;
    }

    @Override
    public void howToMove() {

    }

    public String toStringSaveCSV(){
        return this.getName()+","+this.getAGE()+","+this.getAddress()+","+school;
    }


}
