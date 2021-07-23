function bangcuuchuong() {
    document.write("<table border='1'  cellspacing='1'cellpadding='1'>")
    let i,j;
    for (i=1;i<=9;i++){
        document.write("<tr>");
        console.log(i);

        for(j=2;j<=9;j++){
            console.log(j);
            document.write("<td>" +j + "x" + i + "=" + (i*j));
            document.write("</td>");
                }
        document.write("</tr>");
    }
    document.write("</tr></table>");
}