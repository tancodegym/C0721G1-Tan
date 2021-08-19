package _05_bai5_AccessModifier.thuc_hanh;

class Car {
    private String name;
    private String egnine;
    public static int numberOfCars;

    public Car(String name, String egnine) {
        this.name = name;
        this.egnine = egnine;
        numberOfCars++;
    }
}

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Skyactive 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("HonDa","Skyavtive 6");
        System.out.println(Car.numberOfCars);
    }
}
