
class PrimitiVeriTipleri2{
	short sayi;
	public short getSayi(){
		return sayi;
	}
	public void setSayi(short sayi){
		this.sayi=sayi;
	}
}
public class Ornek5 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrimitiVeritipleri2 tip1 = new PrimitiVeriTipleri2();
		tip1.setSayi((short)50);
		System.out.println("Short tipindeki sayi : "+tip1.getSayi());
		

	}

}
