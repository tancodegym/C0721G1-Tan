let k=prompt('Nhập vào cân nặng của bạn (Kg)!');
let m1=prompt("Nhập vào chiều cao của bạn (m) !");
var m2=m1*m1;
let bmi=(k/m2);
if (bmi<18.5)
    alert("Underweight ! Thiếu cân ! ");

else if (bmi<25)
    alert("Normal ! Bình thường !");

else if (bmi<30)
    alert("Overweight ! Thừa cân !");

else alert("Obese! Béo Phì !!^^^^") ;