package _bai_tap_them.BAI1.model;

public class Vans extends Transport {
    private int tonnage;

    public Vans() {
    }

    public Vans(String bks, String nameProducer, int yearProduce, String nameOwner, int tonnage) {
        super(bks, nameProducer, yearProduce, nameOwner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Vans{" +
                "tonnage=" + tonnage +
                '}'+super.toString();
    }
    public String getString(){
        return super.getString()+","+getTonnage();
    }
}
