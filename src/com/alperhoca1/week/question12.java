package com.alperhoca1.week;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		// girilen sayının basamaklaarını yazdrınız ve basamakalrını toplkamını
		// hesaplayınız.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		int sayı = scanner.nextInt();
		int sayaç = 0;
		System.out.println("Sayının basamakları:");
		while (sayı != 0) {
			int basamak = sayı % 10;
			System.out.println(basamak);
			sayı /= 10;

			sayaç += basamak;

		}
		System.out.println(" basamaklar toplam -> " + sayaç);
	}

}
