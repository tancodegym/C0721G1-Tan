var m= parseInt(prompt('Nhập vào chiều dài cần đổi(m)'));
var ft=m*3.2808;
if (m<=0){
    alert('Độ dài phải lớn hơn 0');
}
else{
document.getElementById("ft").innerHTML=ft;};