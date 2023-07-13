package com.alperhoca1.week;

public class question11 {

	public static void main(String[] args) {
		// 1 den başlayarak toplayarak bütün sayıları toplayacak 50 yi geçene kadar
		// çalıssın.

		// sonuçta toplamı yazdıralım bu döngü kaç kere çalıştığını yazdıralım

		int toplam = 0;
		int say = 0;
		int number = 1;

		while (toplam <= 50) {
			toplam += number;
			number++;
			say++;
		}

		System.out.println("Toplam: " + toplam);
		System.out.println("Döngü sayısı: " + say);
	}

}
