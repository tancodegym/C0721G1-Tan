var c = prompt('Nhập vào độ C');
if (isNaN(c)){alert('bạn phải nhập vào 1 số');

}
else {
    var f=(c*9/5)+32;
    document.getElementById("f").innerHTML=f;

};
