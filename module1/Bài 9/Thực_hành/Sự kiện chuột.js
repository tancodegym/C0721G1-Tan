let img= null;
img= document.getElementById("anh");
function init() {
    img=document.getElementById("anh");
    img.style.position = 'relative';
    img.style.left = '0px';

}
function move() {
    img.style.left = parseInt(img.style.left) + 100+ 'px';

}
window.onload = init();
