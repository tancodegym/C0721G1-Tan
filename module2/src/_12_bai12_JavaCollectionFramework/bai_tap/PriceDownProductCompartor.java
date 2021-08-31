package _12_bai12_JavaCollectionFramework.bai_tap;

import java.util.Comparator;

public class PriceDownProductCompartor implements Comparator<LuyenTapSuDungArrayListVaLinkedListTrongJavaCollectionFramework.RunMain.Product> {


    @Override
    public int compare(LuyenTapSuDungArrayListVaLinkedListTrongJavaCollectionFramework.RunMain.Product o1, LuyenTapSuDungArrayListVaLinkedListTrongJavaCollectionFramework.RunMain.Product o2) {
        if(o1.getPriceProduct() < o2.getPriceProduct()){
            return 1;
        }else if(o1.getPriceProduct() == o2.getPriceProduct()){
            return 0;
        }else{
            return -1;
        }
    }
}
