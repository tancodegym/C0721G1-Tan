function upArrowPressed() {
    let element = document.getElementById("nobita");
    element.style.top = parseInt(element.style.top) - 50 + 'px';
}

function downArrowPressed() {
    var element = document.getElementById("nobita");
    element.style.top = parseInt(element.style.top) + 50 + 'px';
}

function leftArrowPressed() {
    var element = document.getElementById("nobita");
    element.style.left = parseInt(element.style.left) - 50 + 'px';
}

function rightArrowPressed() {
    var element = document.getElementById("nobita");
    element.style.left = parseInt(element.style.left) + 50 + 'px';
}

function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            leftArrowPressed();
            break;
        case 39:
            rightArrowPressed();
            break;
        case 38:
            upArrowPressed();
            break;
        case 40:
            downArrowPressed();
            break;
    }
}

function docReady() {
    window.addEventListener('keydown', moveSelection)};