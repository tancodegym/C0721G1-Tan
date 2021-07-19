

function tong() {
    var a = document.getElementById("nhap1").value;
    var b = document.getElementById("nhap2").value;
    var A = parseInt(a);
    console.log(A);
    var B = parseInt(b);
    var tong = A + B;
    console.log(tong);
    document.getElementById("text").innerHTML = tong
};

function hieu() {
    var a = document.getElementById("nhap1").value;
    var b = document.getElementById("nhap2").value;
    var A = parseInt(a);
    var B = parseInt(b);

    var hieu = A - B;
    document.getElementById("text").innerHTML = hieu
};

function tich() {
    var a = document.getElementById("nhap1").value;
    var b = document.getElementById("nhap2").value;
    var A = parseInt(a);
    var B = parseInt(b);

    var tich = A * B;
    document.getElementById("text").innerHTML = tich
};

function thuong() {
    var a = document.getElementById("nhap1").value;
    var b = document.getElementById("nhap2").value;
    var A = parseInt(a);
    var B = parseInt(b);

    var thuong = A / B;
    document.getElementById("text").innerHTML = thuong
};
