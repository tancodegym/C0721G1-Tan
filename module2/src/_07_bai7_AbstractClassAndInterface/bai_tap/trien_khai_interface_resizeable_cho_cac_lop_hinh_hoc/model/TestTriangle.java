package _07_bai7_AbstractClassAndInterface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;


public class TestTriangle {
        public static void main(String[] args) {
            Triangle triangle = new Triangle();
            System.out.println(triangle.toString());
            System.out.println();
            triangle = new Triangle("Red", true, 3, 4, 5);
            System.out.println(triangle.toString());
        }
}
