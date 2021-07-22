var l = parseInt(prompt('Nhập vào chiều dài cạnh của hình vuông(m)'));
if(l<=0){
    alert('Đây không phải là hình vuông');
}
else{
var s=l*l;
document.getElementById('dt').innerHTML=s;};
