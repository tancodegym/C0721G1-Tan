var a= parseInt(prompt('Nhập vào a'));
//console.log(a);
var b= parseInt(prompt('Nhập vào b'));
//console.log(b);
if (a==0){
    if (b==0){
        document.write('Phương trình có vô số nghiệm !');

    }
    else {
        document.write('phương trình vô nghiệm');
    };
}
else {
    var x=-b/a;
    document.write('Phương trình có nghiệm là:' +x);
};