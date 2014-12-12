
class IntanceDegiskenler{
	boolean karar;
	int sayi;
	String metin;
	public void doYazdir(){
		System.out.println("karar: "+karar);
		System.out.println("Sayi: "+sayi);
		System.out.println("Metin: "+metin);
	}
}

public class Ornek19 {

	public static void main(String[] args) {
		IntanceDegiskenler instance1 = new IntanceDegiskenler();
		instance1.doYazdir();
		
	}

}
