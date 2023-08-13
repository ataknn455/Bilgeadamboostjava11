package com.ata;

public class Runner {

	public static void main(String[] args) {
		/**
		 * Soru
Bir kitaplık uygulaması geliştirmek istiyorsunuz. Uygulamanın şu özellikleri içermesini sağlayın:
Kitap Sınıfı (Book Class): Her kitap için başlık, yazar, ISBN numarası ve yayın yılı gibi bilgileri içermelidir.


Kitaplık Sınıfı (Library Class): Kitapları içinde barındırmalı ve kitap eklemek, silmek, aramak gibi işlemleri yapabilmelidir.
Polimorfizm: Bir "Görüntüle" interface'i tanımlayın ve bu interface'i kullanarak farklı görüntüleme şekilleri (örneğin, konsola yazdırma veya dosyaya yazdırma) sağlayın.


Encapsulation: Kitap detaylarına erişimi sınırlayın ve bunlara erişmek için uygun metotlar sağlayın.
Constructor Kullanımı: Kitap ve Kitaplık sınıfları için uygun yapıcı metotlar tanımlayın.
		 */

		Goruntule konsolGoruntuleme = new KonsolGoruntuleme();
        Kutuphane kutuphane = new Kutuphane(10, konsolGoruntuleme);

		

	        Kitap kitap1 = new Kitap("Alice's Adventures in Wonderland", "Lewis Carroll", "978", 1865);
	        Kitap kitap2 = new Kitap("Zengin baba,yoksul baba", "Rober kyosaki", "979", 2012);

	        kutuphane.kitapEkle(kitap1);
	        kutuphane.kitapEkle(kitap2);
		
	     // Diğer işlemler burada yapılabilir...
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
