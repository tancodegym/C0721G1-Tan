package _10_bai10_DSADanhSach.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrienKhaiLopListDonGian {
    public static class MyList<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object element[];

        public MyList() {
            element = new Object[DEFAULT_CAPACITY];
        }

        private void ensureCapa() {
            int newSize = element.length * 2;
            element = Arrays.copyOf(element, newSize);
        }

        public void add(E e) {
            if (size == element.length) {
                ensureCapa();
            }
            element[size++] = e;
        }

        public E get(int i) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
            }
            return (E) element[i];
        }
    }

    static class MyListTest {
        public static void main(String[] args) {
            MyList<Integer> listInt = new MyList<Integer>();
            listInt.add(1);
            listInt.add(2);
            listInt.add(3);
            listInt.add(4);
            listInt.add(5);
            System.out.println("element 0: " + listInt.get(0));
            System.out.println("element 1: " + listInt.get(1));
            System.out.println("element 2: " + listInt.get(2));
            System.out.println("element 3: " + listInt.get(3));
            System.out.println("element 4: " + listInt.get(4));
//            listInt.get(-1);
//            System.out.println("element -1: " + listInt.get(-1));
        }
    }
}
