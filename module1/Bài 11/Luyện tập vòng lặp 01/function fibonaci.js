function f(n) {
    var a=1, b=0, f;
    for (i = 0; i < n; i++) {
        f = a;
        a = a + b;
        b = f;
        document.write(f + "</br>") ;
    }
}