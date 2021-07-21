let name = prompt("Nhập vào tên user của bạn");
if (name == "Admin") {
    let pass = prompt("Nhập vào mật khẩu của bạn");
    if (pass == "TheMaster") {
        alert("Welcome")
    } else if (pass == "null") {
        alert("Canceled")
    } else {
        alert("Wrong password")
    }
} else if (name == "null") {
    alert("canceled")
} else {
    alert("I don't know You!!!")
}