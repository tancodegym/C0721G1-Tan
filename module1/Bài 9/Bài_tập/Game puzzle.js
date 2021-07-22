var anh = ["https://i.imgur.com/sQum2pK.png", "https://i.imgur.com/1r83vWM.png", "https://i.imgur.com/Aph7l0k.png"]
    var n = 0;

function doi1() {
    var anh1 = document.getElementById("anh1");
    n++;
    if (n >= anh.length) {
        n = 0;
    }
    anh1.src = anh[n];
    chucmung();
}

function doi2() {
    var anh2 = document.getElementById("anh2");
    n++;
    if (n >= anh.length) {
        n = 0;
    }
    anh2.src = anh[n];
    chucmung();
}

function doi3() {
    var anh3 = document.getElementById("anh3");
    n++;
    if (n >= anh.length) {
        n = 0;
    }
    anh3.src = anh[n];
    chucmung();
}

function doi4() {
    var anh4 = document.getElementById("anh4");
    n++;
    if (n >= anh.length) {
        n = 0;
    }
    anh4.src = anh[n];
    chucmung();
}

function doi5() {
    var anh5 = document.getElementById("anh5");
    n++;
    if (n >= anh.length) {
        n = 0;
    }
    anh5.src = anh[n];
    chucmung();
}

function chucmung() {
    if (anh1.src == anh2.src && anh2.src==anh3.src && anh3.src==anh4.src && anh4.src==anh5.src && anh5.src==anh1.src)
    {
        alert("Chúc mừng bạn đã hoàn thành bức tranh này !")
    }

}

//https://i.imgur.com/sQum2pK.png vàng
//   https://i.imgur.com/1r83vWM.png xanh
//      https://i.imgur.com/Aph7l0k.png đỏ