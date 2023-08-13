package com.ata;

public class Kitap {

	private String baslık;
	private String yazar;
	private String Isbn;
	private int yayınyılı;
	
	
	
	// burda nesnelerimizi tanımladık
	
	
	
	
	public Kitap(String baslık, String yazar, String isbn, int yayınyılı) {
		super();
		this.baslık = baslık;
		this.yazar = yazar;
		this.Isbn = isbn;
		this.yayınyılı = yayınyılı;	
		//  burda  constr. aldık
	}

	public String getBaslık() {
		return baslık; // ve bu kısımda get&set alıyoruz çünkü verileri kullanma alma ve değiştirme işlemleri yaapbilmek için
	}

	public void setBaslık(String baslık) {
		this.baslık = baslık;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		this.Isbn = isbn;
	}

	public int getYayınyılı() {
		return yayınyılı;
	}

	public void setYayınyılı(int yayınyılı) {
		this.yayınyılı = yayınyılı;
	}
	
	
}
