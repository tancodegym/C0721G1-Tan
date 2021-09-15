package _fix_bug._fix_bug_thu_6_ngay_27_08_2021;

public class Address {
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
