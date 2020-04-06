package hesaplamaApp;

public class HesaplamaApp {

	public static void main(String[] args) {
		hesap toplama = new Toplama();
		String sonuc =toplama.sonucubul("100","100000");
		System.out.println(sonuc);
	}

}
