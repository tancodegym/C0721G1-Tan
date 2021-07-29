let year = parseInt(prompt('Nhập vào số năm '));
if (year % 4 == 0) {
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            alert(year + " Đây là năm nhuận");
        } else {
            alert(year + " Đây không phải là năm nhuận");
        }
    } else {
        alert(year + " Đây là năm nhuận");
    }
} else {
    alert(year + " Đây không phải là năm nhuận");
}