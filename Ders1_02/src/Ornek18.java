
class YerelDegiskenler{
	public void topla(){//"topla" isminin k���kle ba�lamas�na dikkat etmek gerek!
		int a= 5;
		a+=10;
		System.out.println("a= "+ a);
	}
	public void topla2(){// *** Metotlar aras� ula��m yoktur.***Herhangi bir de�er atamak zorunday�z.
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
