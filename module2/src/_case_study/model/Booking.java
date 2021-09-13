package _case_study.model;

public class Booking {
    private String bookingCode;
    private String startDate;
    private String endDate;
    private String serviceName;
    private String customerCode;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingCode, String startDate, String endDate,
                   String serviceName, String customerCode, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.customerCode = customerCode;
        this.serviceType = serviceType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String getString(){
        return getBookingCode()+","+getStartDate()+","+getEndDate()+","+getServiceName()+","+getCustomerCode()+","+getServiceType();
    }
}
