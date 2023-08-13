package Java_Abstract;

public class soru_3_soyutlama {

	/**
	 * Soyut sınıflar ile interfaceler arasındaki farkları açıklayın ve her iki durum için de örnekler verin.
	 * 
	 * 
	 */
	
	
	// SOYUT SINIFLAR 
	
	/**
	 * 1-Soyut sınıflar hem soyut metodları tamamlamış metotler içerebilir
	 * 
	 * 2-bir sınıf yalnızca bir soyut sınıf miras alabilir
	 * 
	 * 3-soyut sınıflar sınıf mirası inheeritance kullarank davranışları paylaşan sınıflar için kullanılır.
	 * 
	 * 4-alt sınıflar için bir temel sınıf oalrak hizmet verebilir ve ortak kod parçası içerebilir
	 * 
	 * 
	 */
	
	
	// ORNEK :
	
	abstract class Sekil {
	    private String ad;

	    public Sekil(String ad) {
	        this.ad = ad;
	    }

	    public String getAd() {
	        return ad;
	    }

	    public abstract double alanHesapla();  // Soyut metot

	    public void ekranaYaz() {
	        System.out.println("Bu bir " + ad);
	    }
	}
	
	// Interfaces
	
	/**
	 * 1- arayüz yalnızca soyut metotları sabitleri içerebilir. java da çoklu kalıtımı sağlamak için kullanılır
	 * 
	 * 2-bir sınıf birden fazla arayüz kullanabilir
	 * 
	 * 3- arayüzleer farklı sınıflarda aynı davranışları sağlamak için kullanılır
	 * 
	 * 4- arayüzlerin metotlarının imzasını sabtilerini tanımlar ancak impeleemention ayrı sınıflarda yapılır
	 * 
	 */
	
	// ORNEK
	
	
	interface SesCikarabilir {
	    void sesCikar();
	}

	interface HareketEdebilir {
	    void hareketEt();
	}

	class Kedi implements SesCikarabilir, HareketEdebilir {
	    @Override
	    public void sesCikar() {
	        System.out.println("Kedi miyavlıyor!");
	    }

	    @Override
	    public void hareketEt() {
	        System.out.println("Kedi hareket ediyor.");
	    }
	}
	
	
	
	
	
	
	
}
