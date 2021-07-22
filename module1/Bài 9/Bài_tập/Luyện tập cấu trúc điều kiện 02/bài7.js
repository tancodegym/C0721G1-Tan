var a = parseInt(prompt('Nhập vào a'));
var b = parseInt(prompt('Nhập vào b'));
var c = parseInt(prompt('Nhập vào c'));
if (a === 0) {
    if (b === 0) {
        if (c === 0) {
            alert('Phương trình có vô số nghiệm');
        } else {
            alert('Phương trình vô nghiệm');
        }
    } else {
        var x = -c / b;
        alert('Phương trình có 1 nghiệm:' + x);

    }
} else {
    if (b === 0) {
        if (c === 0) {
            alert('Phương trình có vô số nghiệm');
        } else {
            alert('Phương trình vô nghiệm');
        }

    }
    else
        {

            var del = b * b - 4 * a * c;
            if (del < 0) {
                alert('Phương trình vô nghiệm');
            } else if (del = 0) {
                var x = -b / (2 * a);
                alert('Phương trình có nghiệm kép:' + x);
            } else {
                var y = Math.sqrt(del);
                var e = (-b + y) / (2 * a);
                var f = (-b - y) / (2 * a);
                document.write('Nghiệm thứ nhất là' + e);
                document.write('Nghiệm thứ 2 là ' + f);

            }
        }
    }


