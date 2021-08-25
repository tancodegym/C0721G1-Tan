package _10_bai10_DSADanhSach.bai_tap;

import java.util.Arrays;

public class TrienKhaiCacPhuongThucCuaArrayList {
    public static class MyList<E>{
        private int size=0;
        private static final int DEFAULT_CAPACITY =10;
        private Object elements[];
        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }
        private void rangeCheckForAdd(int index) {
            if (index > size || index < 0)
                throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
        private String outOfBoundsMsg(int index){
            return "Index: " + index+" , Size " + index;
        }
        public MyList(int capacity){
            elements=new Object[capacity];

        }
        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        public void add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
        }
        public E remove(int index){
            if(index < size){
                Object obj = elements[index];
                elements[index] = null;
                int tmp = index;
                while(tmp < size){
                    elements[tmp] = elements[tmp+1];
                    elements[tmp+1] = null;
                    tmp++;
                }
                size--;
                return (E) obj;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }

        }

//        public void add(int index, E element){
//            rangeCheckForAdd(index);
//            ensureCapacityInternal(size + 1);
//            System.arraycopy(elements, index, elements, index + 1,
//                    size - index);
//            elements[index] = element;
//            size++;
//        }

//        private void ensureCapacityInternal(int minCapacity) {
//            ensureExplicitCapacity(calculateCapacity(elements, minCapacity));
//        }
        public E get(int i) {
            rangeCheckForAdd(i);
            return (E) elements[i];
        }
        public int size(){
            return size;
        }


    }
}
