package _10_bai10_DSADanhSach.bai_tap;

import java.util.Arrays;
import java.util.Iterator;

interface MyAbstraclist {

    public void add(int index, Object e);

    public void ensureCapacity();

    public void clear();

    public boolean contains(Object e);

    public Object get(int index);

    public void checkIndex(int index);

    public int indexOf(Object e);

    public int lastIndexOf(Object e);

    public Object remove(int index);

    public Object set(int index, Object e);

    public String toString();

    public void trimToSize();



}

class MyArrayList implements MyAbstraclist {
    public static final int INITIAL_CAPACITY = 10;
    private Object[] data = new Object[INITIAL_CAPACITY];
    private int size;

    public MyArrayList() {
    }

    public MyArrayList(Object[] objects) {
        for (int i = 0; i < data.length; i++) {
            add(objects[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public void add(Object e) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = e;
    }

    @Override
    public void add(int index, Object o) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
        data[index] = o;
        size++;
    }

    @Override
    public void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = (Object[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public void clear() {
        data = (Object[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }


    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(data[i]))
                return true;
        return false;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return data[index];

    }

    @Override
    public void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");

    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (o.equals(data[i])) {
                return i;
            }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object e = data[index];
        for (int j = index; j < size - 1; j++){
            data[j] = data[j + 1];
        }
        size--;
        return e;
    }

    @Override
    public Object set(int index, Object o) {
        checkIndex(index);
        Object old = data[index];
        data[index] = o;
        return old;
    }

    @Override
    public void trimToSize() {

        if (size != data.length) {
            Object[] newData = (Object []) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }


}
class TestMyArrayList {
        public static void main(String[] args) {
            MyArrayList listInt = new MyArrayList();
            listInt.add(1);
            listInt.add(4);
            listInt.add(2);
            listInt.add(3);
            listInt.add(4);
            listInt.add(5);
            System.out.println("Hiển thị mảng : "+listInt.toString());
            System.out.println("Lấy ra phần tử tại vị trí thứ 1: " +listInt.get(1));
            System.out.println("Hiển thị độ dài của listInt: "+listInt.getSize());
            System.out.println("Kiểm tra xem có phần tử"+5+" trong listInt không " +listInt.contains(5));
            System.out.println("Vị trí của phần tử " + 3 + " trong listInt là " + listInt.indexOf(3));
            System.out.println("Vị trí xuất hiện cuối cùng của phần tử " +4+" là : " +listInt.lastIndexOf(4));
            listInt.set(0,15);//Đặt phần tử thứ 0 thành 15;
            System.out.println("Sau khi đặt phần tử có index là 0 thành 15");
            System.out.println(listInt.toString());
            System.out.println("Xóa phần tử tại vị trí có index=0");
            listInt.remove(0);
            System.out.println(listInt.toString());


        }
    }
