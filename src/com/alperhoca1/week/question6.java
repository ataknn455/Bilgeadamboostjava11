package com.alperhoca1.week;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		/**
		 * Dairenin alanını ve çevresini bulalım yarı çap dışarıdan input olarak
		 * girilcek pi = 3.14
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Dairenin yarı çapını girin: ");
		double yariCap = scanner.nextDouble();

		double alan = 3.14 * yariCap * yariCap;
		double cevre = 2 * 3.14 * yariCap;

		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);
		scanner.close();
	}

}
