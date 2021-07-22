var a = parseInt(prompt('Nhập vào chiều dài cạnh 1 tam giác vuông'));
var b= parseInt(prompt('Nhập vào chiều dài cạnh 2 tam giác vuông'));
if (a<=0){
    alert('Đây không phải là hình tam giác !!');
}
else {
    if(b<=0){
        alert('Đây không phải là hình tam giác !!');
    }
    else{
        var s=a*b/2;
        document.getElementById('s').innerHTML=s;
    }
}

