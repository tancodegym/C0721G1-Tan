let p;
let c;
let b;
p = prompt('Nhập vào điểm môn Vật Lý');
c = prompt('Nhập vào điểm môn Hóa Học');
b = prompt('Nhập vào điểm môn Sinh Học');
let vl = parseInt(p);
let hh = parseInt(c);
let sh = parseInt(b);
let dtb = (vl + hh + sh)/3;
document.write('Điểm trung bình 3 môn vật lý, hóa học, sinh học là: ' + dtb );
let tong = vl + hh + sh ;
document.write('Tổng điểm 3 môn Vật Lý, Hóa Học, Sinh học là : ' + tong);