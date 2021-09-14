package _case_study.model.trash;

public class CustomerType {
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
