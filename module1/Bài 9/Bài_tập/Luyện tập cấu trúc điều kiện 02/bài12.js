function tinh() {
var tien =parseInt( document.getElementById("tien").value);
console.log(tien);
var thang = parseInt(document.getElementById("thang").value);
var lai = parseInt(document.getElementById("%").value);
var tile = lai/100;
console.log(tile);
if (tien<=0){
    alert('Bạn chưa vay tiền');
}
else {if (thang<=1)
    alert('Bạn chỉ cần trả số tiền vay ban đầu' );
    else {
        var tong = (tien*tile)/12*thang;
        console.log(tong);
        document.getElementById("tong").innerHTML= tong;
}

}
}