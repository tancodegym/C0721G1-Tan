var number = parseInt(prompt('Nhập vào số lượng số nguyên tố cần in ra'));
var count = 0;
var N = 2;
while (count < number) {

    if (checkSNT(N)) {
        document.write("" + N +"</br>");
        count++;
    }
    N++;
}

function checkSNT(N) {
    let check = true;
    for (let i = 2; i < N; i++) {
        if (N % i === 0) {
            check = false;
            break;
        }
    }
    return check;

}
