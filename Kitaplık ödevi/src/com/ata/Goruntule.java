package com.ata;

public interface Goruntule {

	void goruntule(Kitap kitap);
	}

	// Konsola Yazdırma Sınıfı oluşturduk
	class KonsolGoruntuleme implements Goruntule {
	   
	    public void goruntule(Kitap kitap) {
	        System.out.println("Başlık: " + kitap.getBaslık());
	        System.out.println("Yazar: " + kitap.getYazar());
	        System.out.println("ISBN: " + kitap.getIsbn());
	        System.out.println("Yayın Yılı: " + kitap.getYayınyılı());
	        System.out.println();
	        
	        
	    }
	}
