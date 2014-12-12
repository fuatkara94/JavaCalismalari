
class PrimitiVeriTipleri4{
	long sayi;

	public long getSayi() {
		return sayi;
	}

	public void setSayi(long sayi) {
		this.sayi = sayi;
	}
}
public class Ornek09 {

	public static void main(String[] args) {
		PrimitiVeriTipleri4 tip1=new PrimitiVeriTipleri4();
		tip1.setSayi(12324535123445L);
		System.out.println("Long tipindeki sayi: "+tip1.getSayi());

	}

}
