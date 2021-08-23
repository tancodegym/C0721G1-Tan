package _07_bai7_AbstractClassAndInterface.thuc_hanh;
import java.util.Comparator;
import java.util.Arrays;

    class CircleComparator implements Comparator<Circle>{
        @Override
        public int compare(Circle c1, Circle c2){
            if(c1.getRadius()>c2.getRadius()) return 1;
            else if(c1.getRadius()<c2.getRadius()) return -1;
            else return 0;
        }
    }
     class CircleComparatorTest{
        public static void main(String[] args) {
            Circle[] circles = new Circle[3];
            circles[0]=new Circle(3.6);
            circles[1]=new Circle();
            circles[2]= new Circle(3.5,"Black",false);
            System.out.println("Pre-sorted:");
            for (Circle circle : circles) {
                System.out.println(circle.circleToString());
            }
            Comparator circleComparator = new CircleComparator();
            Arrays.sort(circles, circleComparator);

            System.out.println("After-sorted:");
            for (Circle circle : circles) {
                System.out.println(circle.toString());
            }
        }
     }

