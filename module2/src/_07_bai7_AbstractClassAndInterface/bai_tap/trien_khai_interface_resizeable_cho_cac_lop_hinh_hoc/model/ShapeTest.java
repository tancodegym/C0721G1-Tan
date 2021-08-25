package _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
