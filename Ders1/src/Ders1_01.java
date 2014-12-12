import com.sun.java_cup.internal.runtime.Scanner;

class Dort_islem{
	double a , b ;
	double sonuc;
	public void setSayi()
	{
		this.a = a;
		this.b = b;
	}
	public double toplama(double a ,double b)
	{
		sonuc= a + b ;
		return sonuc ;
	}
	public double cikarma(double a ,double b)
	{
		sonuc= a - b ;
		return sonuc ;
	}
	public double carpma(double a ,double b)
	{
		sonuc= a * b ;
		return sonuc ;
	}
	public double bolme(double a ,double b)
	{
		sonuc= a / b ;
		return sonuc ;
	}
	public void getSonuc(){
		System.out.println("Ýþlemin sonucu: " + sonuc);
	}
}

public class Ders1_01 {

	public static void main(String[] args) {
		Dort_islem Toplat = new Dort_islem();
		System.out.println("Birinci sayiyi giriniz: ");
		Scanner input1=new 
		int a=input1.nextdouble();
		System.out.println("Ýkinci sayiyi giriniz: ");
		Scanner input1=new 
		int b=input1.nextdouble();
		

	}

}