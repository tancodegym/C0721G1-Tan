package _04_bai4_ClassAndObject.bai_tap;

import java.util.Scanner;

class QuadraticEquation
{
    public double a,b,c;
    double x1,x2;
    double delta;
    Scanner input=new Scanner(System.in);
    public void getHeSo()
    {
        System.out.print("Nhập vào hệ số bậc 2 a: ");
        this.a=Double.parseDouble(input.nextLine());
        System.out.print("Nhập vào hệ số bậc 1 b: ");
        this.b=Double.parseDouble(input.nextLine());
        System.out.print("Nhập hằng số c: ");
        this.c=Double.parseDouble(input.nextLine());
    }
    public double getDiscriminant()
    {
        delta=((Math.pow(b, 2))-4*a*c);
        return delta;
    }
    public double nghiemduynhat()
    {
        x1=-c/b;
        return x1;
    }
    public double nghiemkep()
    {
        x1=-b/(2*a);
        return x1;
    }
    public void nghiemphanbiet()
    {
        x1=((-b+Math.sqrt(delta))/(2*a));
        x2=((-b-Math.sqrt(delta))/(2*a));
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
    }
}

class KiemTra
{
    QuadraticEquation  pt=new QuadraticEquation ();
    public void nhapPhuongTrinh()
    {
        pt.getHeSo();
    }
    public void kiemTra()
    {
        if(pt.a==0)
        {
            if(pt.b==0)
            {
                System.out.print("phuong trinh vo so nghiem");
            }
            else
            {

                System.out.print("phuong trinh co nghiem duy nhat: "+pt.nghiemduynhat());
            }
        }
        else
        {
            if (pt.getDiscriminant()<0)
            {
                System.out.print("phuong trinh vo nghiem");
            }

            else
            {
                if(pt.getDiscriminant()==0)
                {
                    System.out.print("phuong trinhg co nghiem kep: "+pt.nghiemkep());
                }
                else
                {
                    System.out.println("phuong trinh co 2 nghiem phan biet: ");
                    pt.nghiemphanbiet();
                }
            }
        }
    }
}
class GiaiPhuongTrinhBac2
{
    public static void main(String[] args)
    {
        KiemTra dieuKien=new KiemTra();
        dieuKien.nhapPhuongTrinh();
        dieuKien.kiemTra();
    }
}