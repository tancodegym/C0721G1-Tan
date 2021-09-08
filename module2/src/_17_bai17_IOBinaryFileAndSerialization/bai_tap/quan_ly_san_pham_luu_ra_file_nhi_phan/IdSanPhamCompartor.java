package _17_bai17_IOBinaryFileAndSerialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.util.Comparator;

public class IdSanPhamCompartor implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {
        if (o1.getMaSanPham() > o2.getMaSanPham()) {
            return 1;
        } else if (o1.getMaSanPham() == o2.getMaSanPham()) {
            return 0;
        } else {
            return -1;
        }
    }
}
