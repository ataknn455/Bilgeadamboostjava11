package com.alperhoca1.week;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		// dışarıdan girilen bir sayının faktoriyelini hesaplayalım

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		int sayi = scanner.nextInt();

		int faktoriyel = 1;

		for (int i = 1; i <= sayi; i++)

		{

			faktoriyel = faktoriyel * i;

		}
		System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);

	}

}
