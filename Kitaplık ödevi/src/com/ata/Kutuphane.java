package com.ata;

import java.util.Scanner;

public class Kutuphane {
    private Kitap[] kitaplar;
    private int kitapSayisi;
    private Goruntule goruntulemeYontemi;

    public Kutuphane(int kapasite, Goruntule goruntulemeYontemi) {
        kitaplar = new Kitap[kapasite];
        this.kitapSayisi = 0;
        this.goruntulemeYontemi = goruntulemeYontemi;
    }

    public void kitapEkle(Kitap kitap) {
        if (kitapSayisi < kitaplar.length) {
            kitaplar[kitapSayisi] = kitap;
            kitapSayisi++;
            System.out.println("Kitap eklendi.");
        } else {
            System.out.println("Kütüphane dolu, kitap eklenemedi.");
        }
    }

    public void kitapSil(String arananIsbn) {
        for (int i = 0; i < kitapSayisi; i++) {
            if (kitaplar[i].getIsbn().equals(arananIsbn)) {   
                for (int j = i; j < kitapSayisi - 1; j++) {
                    kitaplar[j] = kitaplar[j + 1];
                }
                kitaplar[kitapSayisi - 1] = null;
                kitapSayisi--;
                System.out.println("Kitap silindi.");
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }

    public void kitapAra(String arananIsbn) {
        for (int i = 0; i < kitapSayisi; i++) {
            if (kitaplar[i].getIsbn().equals(arananIsbn)) {
                goruntulemeYontemi.goruntule(kitaplar[i]);
                return;
            }
        }
        System.out.println("Kitap bulunamadı.");
    }

    public void menuGoster() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("----- Kütüphane Menüsü -----");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Sil");
            System.out.println("3. Kitap Ara");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi girin: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    kitapEkleMenu();
                    break;
                case 2:
                    kitapSilMenu();
                    break;
                case 3:
                    kitapAraMenu();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        } while (secim != 4);
    }

    private void kitapEkleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Başlık: ");
        String baslik = scanner.nextLine();
        System.out.print("Yazar: ");
        String yazar = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Yayın Yılı: ");
        int yayinYili = scanner.nextInt();

        Kitap kitap = new Kitap(baslik, yazar, isbn, yayinYili);
        kitapEkle(kitap);
    }

    private void kitapSilMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz kitabın ISBN'sini girin...: ");
        String isbn = scanner.nextLine();
        kitapSil(isbn);
    }

    private void kitapAraMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aramak istediğiniz kitabın ISBN'sini girin...: ");
        String isbn = scanner.nextLine();
        kitapAra(isbn);
    }
    
    public static void main(String[] args) {
        Goruntule konsolGoruntuleme = new KonsolGoruntuleme();
        Kutuphane kutuphane = new Kutuphane(10, konsolGoruntuleme);

        kutuphane.menuGoster();
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

