function cv() {
    var a = document.getElementById("amount").value;
    var A = parseInt(a);
    var T1 = document.getElementById("TT1").value;

    var T2 = document.getElementById("TT2").value;


    if (T1 === "usd" && T2 === "usd") {
        document.write('Result:' + a)

    }
    ;
    if (T1 === "usd" && T2 === "vietnam") {
        let b = A * 23000;
        document.write('Result:' + b)
    }
    if (T1 === "vietnam" && T2 === "usd") {
        let c = A / 23000;
        document.write('Result:' + c)
    }
    ;
    if (T1 === "vietnam" && T2 === "vietnam") {
        document.write('Result:' + a)
    }
    ;


}
