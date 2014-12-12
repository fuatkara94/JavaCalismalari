
class YerelDegiskenler{
	public void topla(){//"topla" isminin küçükle baþlamasýna dikkat etmek gerek!
		int a= 5;
		a+=10;
		System.out.println("a= "+ a);
	}
	public void topla2(){// *** Metotlar arasý ulaþým yoktur.***Herhangi bir deðer atamak zorundayýz.
		int a= 0;
		a+=10;
		System.out.println("a= "+ a);
	}
}

public class Ornek18 {

	public static void main(String[] args) {
		YerelDegiskenler degisken1 = new YerelDegiskenler();
		degisken1.topla();
		degisken1.topla();
		

	}

}
