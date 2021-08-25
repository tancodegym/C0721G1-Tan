package _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;


public class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(String color, Boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getPerimeter() {
        return (size1 + size2 + size3);
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - size1) * (p - size2) * (p - size3));
    }

    @Override
    public void resizeable(double percent) {
        setSize1(getSize1() * (percent + 1));
        setSize2(getSize2() * (percent + 1));
        setSize3(getSize3() * (percent + 1));
    }

    @Override
    public String toString() {
        return "A Triangle with size1 = " +
                getSize1() +
                ", size2 = " +
                getSize2() +
                ", size3 = " +
                getSize3() +
                " is " +
                super.toString() +
                ", has perimeter : " +
                getPerimeter() +
                "and area : " +
                getArea() + " !";
    }
}

