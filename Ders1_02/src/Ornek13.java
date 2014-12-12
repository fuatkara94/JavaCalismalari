
class PrimitiVeriTipleri6{
	double sayi;

	public double getSayi() {
		return sayi;
	}

	public void setSayi(double sayi) {
		this.sayi = sayi;
	}
}
public class Ornek13 {

	public static void main(String[] args) {
		PrimitiVeriTipleri6 tip1 = new PrimitiVeriTipleri6();
		tip1.setSayi(345345.565);
		System.out.println("Double sayisi: "+tip1.getSayi());
		

	}

}
