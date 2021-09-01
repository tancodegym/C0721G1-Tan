package _14_bai14_ThuatToanSapXep.thuc_hanh;

public class CaiDatThuatToanSapXepNoiBot {
    static int[] list = {2,3,4,5,7,8,4,32,1};
    public static class BubleSort{

        public static void bubleSort(int[] list){
            boolean needNextPass = true;
            for (int k = 1; k < list.length && needNextPass; k++) {
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }
            }
        }}
    }
    public static void main(String[] args) {
        BubleSort.bubleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
