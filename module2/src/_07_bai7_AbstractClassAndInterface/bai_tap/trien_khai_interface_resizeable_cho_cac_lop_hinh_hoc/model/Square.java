package _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public double getArea() {
        return getSide()*getSide();
    }
    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
    @Override
    public void resizeable(double percent){
        setSide(getSide()*(percent+1));
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of Rectangle "
                + ", has perimeter : "+
                getPerimeter()+
                ", and area: "+
                getArea();
    }
}