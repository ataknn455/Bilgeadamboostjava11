package Java_ınheritance;

public class Soru_1_Kalıtım {

	public static void main(String[] args) {
		/**
		 * Soru  1:Java'da bir sınıfın başka bir sınıftan kalıtım
		 * 
		 * almasını sağlayan anahtar kelimenin ne olduğunu açıklayın ve iki sınıf arasında nasıl kullanılacağına dair bir örnek kod yazın.
		 * 
		 */

		
		
		// Üst sınıf (AnaSinif) tanımı
		class AnaSinif {
		    private String ad;

		    public AnaSinif(String ad) {
		        this.ad = ad;
		    }

		    public void selamla() {
		        System.out.println("Merhaba, ben " + ad);
		    }
		}

		// Alt sınıf (AltSinif) tanımı, üst sınıfı kalıtım alıyor
		class AltSinif extends AnaSinif {
		    public AltSinif(String ad) {
		        super(ad); // Üst sınıfın kurucu metodunu çağırıyoruz
		    }

		    public void ekBilgi() {
		        System.out.println("Alt sınıf burada!");
		    }
		}

		public class KalitimOrnegi {
		    public static void main(String[] args) {
		        AltSinif alt = new AltSinif("AltSinif Nesnesi");
		        alt.selamla();   // Üst sınıftan gelen metodu çağırıyoruz
		        alt.ekBilgi();   // Alt sınıfa özgü metodu çağırıyoruz
		    }
		}	
		
		
		
		
		
		
		
		
		
		
	}

}
