function tinh() {
    var month = document.getElementById("thang").value;
    var m = parseInt(month);
    switch (m) {
        case 1 :
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById("text").innerHTML = "Tháng này có 31 ngày"

            break;
        case 2 :
            document.getElementById("text").innerHTML = "Tháng 2 có 28 hoặc 29 ngày"
            break;

        case 4 :
        case 6:
        case 9:
        case 11:
            document.getElementById("text").innerHTML = "Tháng này có 30 ngày"

            break;
        default :
            document.getElementById("text").innerText = "không phải tháng trong năm"

            break;

    }
}