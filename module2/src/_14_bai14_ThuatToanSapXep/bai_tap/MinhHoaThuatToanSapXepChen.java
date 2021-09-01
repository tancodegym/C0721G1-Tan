package _14_bai14_ThuatToanSapXep.bai_tap;

import java.util.Arrays;

public class MinhHoaThuatToanSapXepChen {
    public static void insertSort(int[] list) {
        int key;
        int j;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            System.out.println("Setup " +i+ ":");
            System.out.println(Arrays.toString(list));
            while (j >= 0 && list[j] > key) {

                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 6, -4, 8, 4, 1, 6};
        insertSort(list);
        System.out.println("List after insert sort: " + Arrays.toString(list));

    }
}
