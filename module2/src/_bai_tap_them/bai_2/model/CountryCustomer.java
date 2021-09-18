package _bai_tap_them.bai_2.model;

public class CountryCustomer extends Customer {
    private String typeCustomer;
    private String limitEmployment;

    public CountryCustomer() {
    }

    public CountryCustomer(String customerCode, String name, String typeCustoemr, String limitEmployment) {
        super(customerCode, name);
        this.typeCustomer = typeCustoemr;
        this.limitEmployment = limitEmployment;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getLimitEmployment() {
        return limitEmployment;
    }

    public void setLimitEmployment(String limitEmployment) {
        this.limitEmployment = limitEmployment;
    }

    @Override
    public String toString() {
        return "CountryCustomer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", limitEmployment='" + limitEmployment + '\'' +
                '}'+super.toString();
    }

    public String getCountryCustomerString(){
        return super.getString()+","+ getTypeCustomer()+","+getLimitEmployment();
    }
}
