var k = parseInt(prompt('Nhập vào số kWh gia đình bạn đã xài'));
if(k<=0){
    alert('Gia đình bạn không cần phải trả tiền')
}
else if ( k<50){
    var money= k*1.678 ;
    document.write('Số tiền gia đình bạn phải nộp là:'+money , 'VNĐ'  );
}
else if (k<100){
    var money=k*1.734;
    document.write('Số tiền gia đình bạn phải nộp là:'+money , 'VNĐ'  );
}
else if ( k<200){
    var money=k*2.014;
    document.write('Số tiền gia đình bạn phải nộp là:'+money , 'VNĐ'  );
}
else {var money=k*2.536;
    document.write('Số tiền gia đình bạn phải nộp là:'+money , 'VNĐ'  );

}