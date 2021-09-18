package _bai_tap_them.BAI1.model;

public class Motorbike extends Transport{
    private int power;

    public Motorbike() {
    }

    public Motorbike(int power) {
        this.power = power;
    }

    public Motorbike(String bks, String nameProducer, int yearProduce, String nameOwner, int power) {
        super(bks, nameProducer, yearProduce, nameOwner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "power='" + power + '\'' +
                '}'+super.toString();
    }
    public String getString(){
        return super.getString()+","+getPower();
    }
}
