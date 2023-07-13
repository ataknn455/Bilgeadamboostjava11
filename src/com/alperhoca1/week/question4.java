package com.alperhoca1.week;

public class question4 {

	public static void main(String[] args) {
		/**
		 * iki tane string değişkeni oluşturalım. isim ve soyisim olsun. sonra bu
		 * değişkenleri bir şekilde ekrana yazdıralım
		 * 
		 * a ve b karakterlerinin değerlerini yazın, sonrasında ise değer toplamını
		 * yazdıralım
		 * 
		 * 
		 */
		String isim = "Atakan";
		String soyisim = "taş";

		System.out.println("İsim: " + isim);
		System.out.println("Soyisim: " + soyisim);
		// Sytemourprintln ("isim " + isim);
		// Sytemourprintln ("soyisim " + soyisim);
		System.out.println("######");

		char a = 'a';
		char b = 'b';

		int asciiA = (int) a;
		int asciiB = (int) b;

		System.out.println("a'nın ASCII değeri: " + asciiA);
		System.out.println("b'nin ASCII değeri: " + asciiB);

		int toplam = asciiA + asciiB;

		System.out.println("Toplam: " + toplam);
// ctrl + shift + 7 yaparak 
	}

}
