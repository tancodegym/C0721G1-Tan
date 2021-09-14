package _case_study.model;

public class Contract implements Comparable<Contract> {
    private int contractNumber;
     private String bookingCode;
     private int deposits;
     private int payments;
    private String customerCode;

    public Contract() {
    }

    public Contract(int contractNumber, String bookingCode, int deposits, int payments, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.deposits = deposits;
        this.payments = payments;
        this.customerCode = customerCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDeposits() {
        return deposits;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public int getPayments() {
        return payments;
    }

    public void setPayments(int payments) {
        this.payments = payments;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposits=" + deposits +
                ", payments=" + payments +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
    public String getString(){
        return getContractNumber()+","+getBookingCode()+","+getDeposits()+","+getPayments()+","+getCustomerCode();
    }

    @Override
    public int compareTo(Contract o) {
        if (this.getContractNumber() < o.getContractNumber()) {
            return 1;
        } else if (this.getContractNumber() == o.getContractNumber()) {
            return 0;
        } else {
            return -1;
        }
    }
}
