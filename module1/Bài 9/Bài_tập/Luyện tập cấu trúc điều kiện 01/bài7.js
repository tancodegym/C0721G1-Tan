var t = parseInt(prompt('Nhập vào thời gian gọi đi của bạn(phút)'));
var t1 = parseInt(prompt('Nhập vào thời gian lên mạng của bạn(phút)'));
if (t > 1000) {
    var tong = t * 800 + t1 * 75;
    document.getElementById("tien").innerHTML= tong;
}
 else if(t>500){
    var tong= t*1000 + t1*75;
    document.getElementById("tien").innerHTML= tong;
}
else if(t>100){
    var tong=t*1200 + t1*75;
    document.getElementById("tien").innerHTML= tong;
}
else {
    var tong=t*1500 + t1*100;
    document.getElementById("tien").innerHTML= tong;
}

