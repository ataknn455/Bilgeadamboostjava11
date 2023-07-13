package com.alperhoca1.week;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		/**
		 * Dışarıdan 2 tane değer alacağım iki sayının toplamı çift ise true tek ise
		 * false yazsın
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Birinci sayıyı girin: ");

		int sayi1 = scanner.nextInt();

		System.out.print("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;
		boolean ciftmi = toplam % 2 == 0;

		System.out.println("Toplam: " + toplam);
		System.out.println("Çift mi? " + ciftmi);
		double ortalama = toplam / 2d;
		System.out.println("ortalama" + ortalama);

	}

}
