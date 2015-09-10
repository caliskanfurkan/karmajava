public class Calisan {
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public Calisan(String ad, String soyad, int sicilNo, int maas) {
		this.ad = ad;
		this.soyad = soyad;
		this.sicilNo = sicilNo;
		this.maas = maas;
	}

	private void calis() {
		System.out.println("Çalýþýyoz Emrak");
	}

	private void maasAl() {
		this.calis();
		System.out.println(maas + " TL maaþ aldým oh mis");
	}
	
	private String ad;
	private String soyad;
	private int sicilNo=0000;
	private int maas=0;

}
