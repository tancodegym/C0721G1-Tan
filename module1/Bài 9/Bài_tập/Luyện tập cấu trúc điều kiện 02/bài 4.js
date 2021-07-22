var a= parseInt(prompt('Nhập vào chiều dài hình chữ nhật'));
var b=parseInt(prompt('Nhập vào chiều rộng hình chữ nhật'));
if (a<=0){
    alert('Đây không phải là hình chữ nhật!');
}
else {
    if(b<=0){
        alert('Đây không phải là hình chữ nhật!');
    }
    else{var s=a*b;
        document.getElementById("dt").innerHTML=s;
    }
}