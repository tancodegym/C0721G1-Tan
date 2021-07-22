var a=parseInt(prompt('Nhập vào a'));
var b=parseInt(prompt('Nhập vào b'));
var c= parseInt(prompt('Nhập vào c'));
if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
    alert('a,b,c là 3 cạnh của tam giác');
    }

else{
    alert('a,b,c không phải là 3 cạnh của tam giác');
}