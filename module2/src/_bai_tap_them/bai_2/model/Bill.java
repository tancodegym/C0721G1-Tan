package _bai_tap_them.bai_2.model;

public class Bill {
    private String billCode;
    private String customerCode;
    private String dateOutputBill;
    private int numberOfKW;
    private int price;
    private double money;

    public Bill() {
    }

    public Bill(String billCode, String customerCode, String dateOutputBill, int numberOfKW, int price, double money) {
        this.billCode = billCode;
        this.customerCode = customerCode;
        this.dateOutputBill = dateOutputBill;
        this.numberOfKW = numberOfKW;
        this.price = price;
        this.money = money;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getDateOutputBill() {
        return dateOutputBill;
    }

    public void setDateOutputBill(String dateOutputBill) {
        this.dateOutputBill = dateOutputBill;
    }

    public int getNumberOfKW() {
        return numberOfKW;
    }

    public void setNumberOfKW(int numberOfKW) {
        this.numberOfKW = numberOfKW;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billCode='" + billCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", dateOutputBill='" + dateOutputBill + '\'' +
                ", numberOfKW=" + numberOfKW +
                ", price=" + price +
                ", money=" + money +
                '}';
    }
    public String getString(){
        return getBillCode()+","+getCustomerCode()+","+
                getDateOutputBill()+","+getNumberOfKW()+","+getPrice()+","+getMoney();
    }
}
