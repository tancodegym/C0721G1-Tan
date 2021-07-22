var d = parseInt(prompt('Nhập vào doanh số bán hàng của bạn'));
if (d>10000000){
    var h= (d*5)/100;
    document.write('hoa hồng của bạn là :' +h);
}
else if ( d>10000000){
    var h = (d*10)/100;
    document.write('hoa hồng của bạn là:' +h);
}
else if (d>50000000){
    var h = (d*15)/100;
    document.write('hoa hồng của bạn là:' +h);
}
else if (d>100000000){
    var h = (d*20)/100;
    document.write('hoa hồng của bạn là:'+h)
}
else {
    alert(' Doanh số của bạn không đủ để nhận hoa hồng')
}