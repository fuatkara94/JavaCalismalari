
class PrimitiVeriTipleri3{
	int sayi;// alt+ shift + s tu�una bas�p ��kan kategorlerde "r" Tu�una bas

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
}
public class Ornek7 {

	public static void main(String[] args) {
		PrimitiVeriTipleri3 tip1= new PrimitiVeriTipleri3();
		tip1.setSayi(414354332);
		System.out.println("Integer Tipindeki sayi: "+tip1.getSayi());

	}

}
