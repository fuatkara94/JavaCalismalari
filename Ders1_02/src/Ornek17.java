
class Alfabe{
	char karakter;

	public char getKarakter() {
		return karakter;
	}

	public void setKarakter(char karakter) {
		this.karakter = karakter;
	}
}
public class Ornek17 {

	public static void main(String[] args) {
		Alfabe harf1= new Alfabe();
		harf1.setKarakter('F');
		System.out.println("Harf1 "+harf1.getKarakter());

		Alfabe harf2=new Alfabe();
		harf2.setKarakter((char)71);//Alt�n� �izdi�i i�in () i�inde Char yazd�k.!
		System.out.println("Harf2 :"+harf2.getKarakter());
	}

}
