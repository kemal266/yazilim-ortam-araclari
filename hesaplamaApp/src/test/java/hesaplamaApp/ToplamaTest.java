package hesaplamaApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void test() {
		//Given
		hesap toplama=new Toplama();
		String sayi1="5000";
		String sayi2="750";
		
		//When
		String sonuc =toplama.sonucubul(sayi1, sayi2);
		
		//Then
		assertEquals("5750", sonuc);
	}
	
	@Test
	public void test2() {
		//Given
		hesap toplama=new Toplama();
		String sayi1="-10000";
		String sayi2="1000";
		
		//When
		String sonuc =toplama.sonucubul(sayi1, sayi2);
		
		//Then
		assertEquals("-9000", sonuc);
	}
	@Test
	public void test3() {
		//Given
		hesap toplama=new Toplama();
		String sayi1="-800";
		String sayi2="1000";
		
		//When
		String sonuc =toplama.sonucubul(sayi1, sayi2);
		
		//Then
		assertEquals("300", sonuc);
	}
}
