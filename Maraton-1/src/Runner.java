import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
    	OgrenciOzelListesi ogrenciDizi = new OgrenciOzelListesi();
    	MaasOzelListesi maasOzelListe = new MaasOzelListesi();
    	HobiOzelListesi hobiListesi = new HobiOzelListesi(5);
        Scanner scanner = new Scanner(System.in);
        int secim = 0;
        int ogrenciSayisi = 0; 

        while (true) {
            System.out.println("****************MENÜ****************");
            System.out.println("1- Sınıf arkadaşı tanımla");
            System.out.println("2- Hobilerini gir");
            System.out.println("3- Maaş beklentilerini gir");
            System.out.println("4- Sınıf listesi");
            System.out.println("0- ÇIKIŞ");
            System.out.println("*************************************");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kaç öğrenci tanımlayacaksınız? : ");
                    ogrenciSayisi = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < ogrenciSayisi; i++) {
                        System.out.println((i + 1) + ". Öğrencinin adı: ");
                        String ogrenciAdi = scanner.nextLine();
                        ogrenciDizi.add(ogrenciAdi);
                    }
                    break;

                case 2:
                	
                	 System.out.print("Öğrenci Seçiniz....:");
                     String seciliOgrenci = scanner.nextLine();

                     System.out.print(seciliOgrenci + " Yürümekten hoşlanır mısın [E/H]? ");
                     boolean yurumeSecimi = scanner.nextLine().equalsIgnoreCase("E");
                     System.out.print(seciliOgrenci + " Kitap Okumaktan hoşlanır mısın [E/H]? ");
                     boolean kitapOkumaSecimi = scanner.nextLine().equalsIgnoreCase("E");
                     System.out.print(seciliOgrenci + " Spor rutinlerin var mı [E/H]? ");
                     boolean sporSecimi = scanner.nextLine().equalsIgnoreCase("E");
                     System.out.print(seciliOgrenci + " Kod yazmaktan hoşlanır mısın [E/H]? ");
                     boolean kodYazmaSecimi = scanner.nextLine().equalsIgnoreCase("E");

                     hobiListesi.addHobiListesi(yurumeSecimi, kitapOkumaSecimi, sporSecimi, kodYazmaSecimi);

                     break;


                case 3:
                    System.out.println("Maaş beklentilerini giriniz: ");

                    for (int i = 0; i < ogrenciSayisi; i++) {
                        double maas = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(ogrenciDizi.getlist()[i] + " nın maaş beklentisi: " + maas);
                    }

                    break;

                case 4:
           
                	
                	
                    break;
                

                case 0:
                    System.out.println("ÇIKIŞ");
                    break;

                default:
                    System.err.println("Geçerli bir seçim yapınız.");
            }
        }
    }
}
                        
                        
                        
                        
                        
                        
                        
                        