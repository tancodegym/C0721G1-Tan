package _fix_bug._fix_bug_thu_6_ngay_27_08_2021;

public abstract class Person {
    private String name;
    private  int AGE;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, int AGE, Address address) {
        this.name = name;
        this.AGE = AGE;
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", AGE=" + AGE +
                ", address=" + address +
                '}';
    }
    public abstract void howToMove();
}
