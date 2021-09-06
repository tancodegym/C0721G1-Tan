package _case_study.model;

public class Customer extends Person {
    private String customerCode;
    private CustomerType customerType;
    private Address address;
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
    public String toString(){
        return "Customer type is: "+customerType;
    }

}
 class Address {
    private String houseNumber;
    private String stress;
    private String ward;
    private String district;
    private String province;
    public Address() {
    }

    public Address(String houseNumber, String stress, String ward, String district, String province) {
        this.houseNumber = houseNumber;
        this.stress = stress;
        this.ward = ward;
        this.district = district;
        this.province = province;
    }

    @Override
    public String toString() {
        return "{" +
                "houseNumber='" + houseNumber + '\'' +
                ", stress='" + stress + '\'' +
                ", ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }


}
