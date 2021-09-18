package _bai_tap_them.bai_2.model;

public class TypeOfCustomer {
    private String codeOfTypeCustomer;
    private String uses;

    public TypeOfCustomer() {
    }

    public TypeOfCustomer(String codeOfTypeCustomer, String uses) {
        this.codeOfTypeCustomer = codeOfTypeCustomer;
        this.uses = uses;
    }

    public String getCodeOfTypeCustomer() {
        return codeOfTypeCustomer;
    }

    public void setCodeOfTypeCustomer(String codeOfTypeCustomer) {
        this.codeOfTypeCustomer = codeOfTypeCustomer;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "TypeOfCustomer{" +
                "codeOfTypeCustomer='" + codeOfTypeCustomer + '\'' +
                ", uses='" + uses + '\'' +
                '}';
    }
    public String getString(){
        return getCodeOfTypeCustomer()+","+getUses();
    }
}
