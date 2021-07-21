var x= '';
function a(id){
    return document.getElementById(id);
    
}
function f(value) {
    var x= '';
    x += value;
    a("duoi").value+=x ;
}
function del() {
    x = "";
    a("duoi").value =x;

}
function tinh() {
    a("duoi").value= eval(a("duoi").value);

}
