package com.alperhoca1.week;

import java.util.Scanner;

public class question13 {

	public static void main(String[] args) {
		/**
		 * dışardan 2 adet sayı girip 1.sayıyı 2.sayıyı kuvveti seklinde hesaplamak için
		 * gereken kod
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir taban degeri giriniz : ");
		int tabanDegeri = scanner.nextInt();
		System.out.print("Lutfen bir us degeri giriniz : ");
		int us = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		int sonuc = 1;

		while (i <= us) {
			sonuc *= tabanDegeri;
			i++;
			System.out.println(sonuc);
		}

		System.out.print("Lutfen isminizi girin : ");
		String isim = scanner.nextLine();

		System.out.println(isim + " Girdiğin taban : " + tabanDegeri + " Girdiğin üs : " + us + " sonuc : " + sonuc);

	}

}
