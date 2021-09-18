package _bai_tap_them.bai_2.model;

public class Customer {
    private String customerCode;
    private String name;

    public Customer() {
    }

    public Customer(String customerCode, String name) {
        this.customerCode = customerCode;
        this.name = name;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String getString(){
        return getCustomerCode()+","+getName();
    }
}
