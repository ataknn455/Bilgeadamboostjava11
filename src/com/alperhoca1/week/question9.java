package com.alperhoca1.week;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		/**
		 * kullanıcılara verilen sayının çarpım tablosunu giren programı yazınız
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayıyı giriniz");

		int sayi = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {

			int carpim = sayi * i;

			System.out.println(sayi + "x" + i + "y");

		}

	}

}
