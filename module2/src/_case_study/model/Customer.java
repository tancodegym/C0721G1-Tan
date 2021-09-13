package _case_study.model;

public class Customer extends Person {
    private String customerCode;
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String idCard,
                    String phoneNumber, String email, String address, String customerCode,
                    CustomerType customerType) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email, address);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerType=" + customerType +
                '}'+super.toString();
    }

    public String getCustomerString() {
        return super.getPersonString() + "," + getCustomerCode() + "," + getCustomerType();
    }
}
