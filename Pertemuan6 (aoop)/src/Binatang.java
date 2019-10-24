
public abstract class Binatang {
	private int kaki;
	private int kepala;
	private int tangan;
	private int kecepata;
	
	abstract void tenaga();
	abstract void lapar();
	
	public int getKaki() {
		return kaki;
	}
	public void setKaki(int kaki) {
		this.kaki = kaki;
	}
	public int getKepala() {
		return kepala;
	}
	public void setKepala(int kepala) {
		this.kepala = kepala;
	}
	public int getTangan() {
		return tangan;
	}
	public void setTangan(int tangan) {
		this.tangan = tangan;
	}
	public int getKecepata() {
		return kecepata;
	}
	public void setKecepata(int kecepata) {
		this.kecepata = kecepata;
	}

	
}
