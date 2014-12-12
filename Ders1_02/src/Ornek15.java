
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
		System.out.println("Bay mı ? : "+cins.isCinsiyet());// boolean e özel isCinsiyet olur diğerlerinde get ve set kullanıyorduk.
		

	}

}
