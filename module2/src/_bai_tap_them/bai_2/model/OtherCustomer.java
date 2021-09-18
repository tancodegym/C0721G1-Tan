package _bai_tap_them.bai_2.model;

public class OtherCustomer extends Customer {
    private String nameOfCountry;

    public OtherCustomer() {
    }

    public OtherCustomer(String customerCode, String name, String nameOfCountry) {
        super(customerCode, name);
        this.nameOfCountry = nameOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    @Override
    public String toString() {
        return "OtherCustomer{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                '}'+super.toString();
    }

    public String getOtherCustomerString(){
        return super.getString()+","+getNameOfCountry();
    }
}
