let good = document.getElementById("Good");
let cheap = document.getElementById("Cheap");
let fast = document.getElementById("Fast");
good.checked=false;
cheap.checked=false;
fast.checked=false;
function check() {
    if (good.checked && cheap.checked){
        fast.checked=false;
    }
    if (cheap.checked && good.checked){
        fast.checked=false;
    }
    if (good.checked && fast.checked){
        cheap.checked=false;
    }
    if(cheap.checked && fast.checked){
        good.checked=false;
    }
    if (fast.checked && good.checked){
        cheap.checked=false;
    }
    if (fast.checked && cheap.checked){
        good.checked=false;
    }

}