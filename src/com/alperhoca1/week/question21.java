package com.alperhoca1.week;

import java.util.Scanner;

public class question21 {

	public static void main(String[] args) {
		// kulanıcı 1 ile 7 arası bir sayı girsin bu sayıya denk gelen günleri yazdıran
		// kod

		Scanner scanner = new Scanner(System.in);

		System.out.print("Lütfen 1 ile 7 arasında bir sayı girin: ");
		int dayNumber = scanner.nextInt();

		switch (dayNumber) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Geçersiz bir sayı girdiniz!");
			break;
		}
	}

}
