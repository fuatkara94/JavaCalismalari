
class PrimitiVeriTipleri5{
	float sayi;

	public float getSayi() {
		return sayi;
	}

	public void setSayi(float sayi) {
		this.sayi = sayi;
	}
}
public class Ornek11 {

	public static void main(String[] args) {
		PrimitiVeriTipleri5 tip1= new PrimitiVeriTipleri5();
		tip1.setSayi(4536356.05f);
		System.out.println("Float sayisi: "+tip1.getSayi());
		

	}

}
