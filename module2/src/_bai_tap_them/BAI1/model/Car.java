package _bai_tap_them.BAI1.model;

public class Car extends Transport {
    private int numberOfSit;
    private String typeOfCar;

    public Car() {
    }

    public Car(int numberOfSit, String typeOfCar) {
        this.numberOfSit = numberOfSit;
        this.typeOfCar = typeOfCar;
    }

    public Car(String bks, String nameProducer, int yearProduce, String nameOwner, int numberOfSit, String typeOfCar) {
        super(bks, nameProducer, yearProduce, nameOwner);
        this.numberOfSit = numberOfSit;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSit() {
        return numberOfSit;
    }

    public void setNumberOfSit(int numberOfSit) {
        this.numberOfSit = numberOfSit;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSit=" + numberOfSit +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}'+super.toString();
    }
    public String getString(){
        return super.getString()+","+getNumberOfSit()+","+getTypeOfCar();
    }
}
