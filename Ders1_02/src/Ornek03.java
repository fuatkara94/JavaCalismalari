class PrimitiVeriTipleri1{
	byte sayi;
	public void setSayi(byte sayi){
		this.sayi=sayi;
		
	}
	public byte getSayi(){
		return sayi;
	}
}
public class Ornek03 {

	public static void main(String[] args) {
		PrimitiVeriTipleri1 tip1= new PrimitiVeriTipleri1();
		tip1.setSayi((byte)50);
		System.out.println(tip1.getSayi());
		

	}

}
