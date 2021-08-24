package _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.model;

import _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc.service.IColorable;

public class Square extends Rectangle implements IColorable {
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
    public  void howToColor(){
        System.out.println("Color all four sides.");
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