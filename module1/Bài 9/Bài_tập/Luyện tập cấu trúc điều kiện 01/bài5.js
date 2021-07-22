var a =parseInt(prompt('Nhập vào điểm kiểm tra'));
var b=parseInt(prompt('Nhập vào điểm thi giữa kì'));
var c=parseInt(prompt('Nhập vào điểm thi cuối kì'));
var dtb=(a+b*2+c*4)/7;
if (dtb>=8.5){
    document.write('Học sinh xếp loại giỏi');
}
else if(dtb>=7){
    document.write('Học sinh xếp loại khá');
}
else if(dtb>=5){
    document.write('Học sinh xếp loại trung bình');
}
else{
    document.write('Học sinh xếp loại yếu');
}
