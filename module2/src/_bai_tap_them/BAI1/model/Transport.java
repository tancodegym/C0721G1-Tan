package _bai_tap_them.BAI1.model;

public class Transport {
    private String bks;
    private String nameProducer;
    private int yearProduce;
    private String nameOwner;

    public Transport() {
    }

    public Transport(String bks, String nameProducer, int yearProduce, String nameOwner) {
        this.bks = bks;
        this.nameProducer = nameProducer;
        this.yearProduce = yearProduce;
        this.nameOwner = nameOwner;
    }

    public String getBks() {
        return bks;
    }

    public void setBks(String bks) {
        this.bks = bks;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public int getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "bks='" + bks + '\'' +
                ", nameProducer='" + nameProducer + '\'' +
                ", yearProduce=" + yearProduce +
                ", nameOwner='" + nameOwner + '\'' +
                '}';
    }
    public String getString(){
        return getBks()+","+getNameProducer()+","+getYearProduce()+","+getNameOwner();
    }
}
