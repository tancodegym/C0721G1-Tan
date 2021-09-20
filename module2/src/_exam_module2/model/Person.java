package _exam_module2.model;

public abstract class Person {
    private String personCode;
    private String personName;
    private String personDateOfBirth;
    private String personGender;
    private String personPhone;

    public Person() {
    }

    public Person(String personCode, String personName,
                  String personDateOfBirth, String personGender, String personPhone) {
        this.personCode = personCode;
        this.personName = personName;
        this.personDateOfBirth = personDateOfBirth;
        this.personGender = personGender;
        this.personPhone = personPhone;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonDateOfBirth() {
        return personDateOfBirth;
    }

    public void setPersonDateOfBirth(String personDateOfBirth) {
        this.personDateOfBirth = personDateOfBirth;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personCode='" + personCode + '\'' +
                ", personName='" + personName + '\'' +
                ", personDateOfBirth='" + personDateOfBirth + '\'' +
                ", personGender='" + personGender + '\'' +
                ", personPhone='" + personPhone + '\'' +
                '}';
    }
    public String getPersonString(){
        return getPersonCode()+","+getPersonName()+","
                +getPersonDateOfBirth()+","+getPersonGender()+","+getPersonPhone();
    }
     abstract void show();
}
