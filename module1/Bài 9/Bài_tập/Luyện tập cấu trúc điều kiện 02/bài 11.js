var l = parseInt(prompt('Nhập vào tiền lương của bạn'));
if (l<5000000){
    alert('Bạn không phải nộp thuế');
}
else if(l==5000000){
    var t=l*5/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else if (5000000<l<=10000000){
    var t=l*10/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else if (10000000<l<=18000000){
    var t=l*15/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else if (18000000<l<=32000000){
    var t=l*20/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else if (32000000<l<=52000000){
    var t=l*25/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else if (52000000<l<=80000000){
    var t=l*30/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');
}
else{
    var t=l*35/100
    document.write('Thuế thu nhập cá nhân bạn phải nộp là:' +t,'VNĐ');

}