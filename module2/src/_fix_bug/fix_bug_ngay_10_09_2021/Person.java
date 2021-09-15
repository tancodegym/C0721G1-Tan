package _fix_bug.fix_bug_ngay_10_09_2021;

public abstract class Person {
    private String name;
    private  int AGE;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int AGE, String address) {
        this.name = name;
        this.AGE = AGE;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name= " + name + '\'' +
                ", AGE= " + AGE +
                ", address= " + address;
    }
    public abstract void howToMove();
}
