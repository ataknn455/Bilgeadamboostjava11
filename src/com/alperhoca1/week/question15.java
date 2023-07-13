package com.alperhoca1.week;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		/**
		 * klavyeden 0 girilinceye kadar değer giricez 0 girildiğinde sayıların toplamı
		 * ve ortalamasını yazıcaz
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz:");

		int sayı = scanner.nextInt();

		int sayaç = 0;

		int ortalama = 0;

		int toplam = 0;

		while (sayı != 0) {
			toplam += sayı;

			ortalama = toplam / sayı;
			sayaç++;
			System.out.println("lütfen bir sayı giriniz:");
			sayı = scanner.nextInt();

		}

		System.out.println("toplam" + toplam + "\nortlama" + ortalama);

	}

}
