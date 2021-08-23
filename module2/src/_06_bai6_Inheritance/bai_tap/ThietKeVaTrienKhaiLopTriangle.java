package _06_bai6_Inheritance.bai_tap;


    class Shape {
        private String color = "green";
        private Boolean filled = true;

        public Shape() {

        }

        public Shape(String color, Boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean isFilled() {
            return filled;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }

        public String shapeToString() {
            return "a Shape with color of " + getColor() + " and " + (isFilled() ? " filled" : " not filled");
        }
    }

    class ShapeTest {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape.shapeToString());

            shape = new Shape("red", false);
            System.out.println(shape.shapeToString());

        }

    }

    class Triangle extends Shape {
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
        public String shapeToString() {
            return "A Triangle with size1 = " +
                    getSize1() +
                    ", size2 = " +
                    getSize2() +
                    ", size3 = " +
                    getSize3() +
                    " is " +
                    super.shapeToString() +
                    ", has perimeter : " +
                    getPerimeter() +
                    "and area : " +
                    getArea() + " !";
        }
    }
    class TestTriangle {
        public static void main(String[] args) {
            Triangle triangle = new Triangle();
            System.out.println(triangle.shapeToString());
            System.out.println();
            triangle = new Triangle("Red", true, 3, 4, 5);
            System.out.println(triangle.shapeToString());
        }
    }
