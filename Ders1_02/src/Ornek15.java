
class cinsiyet{
	boolean cinsiyet;

	public boolean isCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(boolean cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
}

public class Ornek15 {

	public static void main(String[] args) {
		cinsiyet cins = new cinsiyet();
		cins.setCinsiyet(true);
		System.out.println("Bay m� ? : "+cins.isCinsiyet());// boolean e �zel isCinsiyet olur di�erlerinde get ve set kullan�yorduk.
		

	}

}
