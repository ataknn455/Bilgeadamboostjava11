package com.alperhoca1.week;

import java.util.Scanner;

public class quesiton19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/**
		 * Girilen sayının 5'in kuvveti olup olmadıgını bulan program
		 * 
		 * 
		 */
		System.out.println("lütfen bir sayı giriniz:");
		int sayı = scanner.nextInt();
		boolean kontrol = true;
		if (sayı == 1) {
			;
			System.out.println("sayı 5 in kuvvetidir");
			kontrol = false;
		} else if (sayı < 0) {
			System.out.println("sayı 5 in kuvveti değildir");
			kontrol = false;

		}

		while (kontrol) {
			if (sayı % 5 == 0) {
				sayı /= 5;
				if (sayı == 1) {
					System.out.println("sayı 5 in kuvvetidir");

				}
			} else
				System.out.println("sayı 5in kuvveti değildir");
			kontrol = false;

		}

	}

}
