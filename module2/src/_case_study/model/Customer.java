package _case_study.model;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerCode;
    private CustomerType customerType;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String idCard,
                    String phoneNumber, String email, Address address,
                    String customerCode, CustomerType customerType) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email, address);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerType=" + customerType +
                '}'+super.toString();
    }
}
class CustomerType{
    private String customerType;

    public CustomerType() {
    }
    public CustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "customerType='" + customerType + '\'' +
                '}';
    }
}
