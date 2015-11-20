package pk.team.manufactory;

public class Truck extends Vehicle {
	private int szerokoscKontenera;
	private int glebokoscKontenera;
	private int wysokoscKontenera;
	private int ladownoscKg;

	public Truck(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena,
			int pojemnoscBagaznika, boolean dostepnyDlaKlientowEkskluzywnych,
			int szerokoscKontenera, int glebokoscKontenera,
			int wysokoscKontenera, int ladownoscKg) {
		super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika,
				dostepnyDlaKlientowEkskluzywnych);
		this.szerokoscKontenera = szerokoscKontenera;
		this.glebokoscKontenera = glebokoscKontenera;
		this.wysokoscKontenera = wysokoscKontenera;
		this.ladownoscKg = ladownoscKg;
	}

	public int getSzerokoscKontenera() {
		return szerokoscKontenera;
	}

	public void setSzerokoscKontenera(int szerokoscKontenera) {
		this.szerokoscKontenera = szerokoscKontenera;
	}

	public int getGlebokoscKontenera() {
		return glebokoscKontenera;
	}

	public void setGlebokoscKontenera(int glebokoscKontenera) {
		this.glebokoscKontenera = glebokoscKontenera;
	}

	public int getWysokoscKontenera() {
		return wysokoscKontenera;
	}

	public void setWysokoscKontenera(int wysokoscKontenera) {
		this.wysokoscKontenera = wysokoscKontenera;
	}

	public int getLadownoscKg() {
		return ladownoscKg;
	}

	public void setLadownoscKg(int ladownoscKg) {
		this.ladownoscKg = ladownoscKg;
	}

	public String wyswietlPojazd() {
		if (dostepnoscNaStanie) {
			return "Id: " + this.id + ", dostepnosc na stanie: "
					+ dostepnoscNaStanie + ", typ nadwozia: "
					+ getTypNadwozia() + ", pojemnosc silnika: "
					+ pojemnoscSilnika + ", pojemnosc bagaznika: "
					+ pojemnoscBagaznika + ", cena: " + cena
					+ ", dostepny dla klasy ekskluzywnej: "
					+ dostepnyDlaKlientowEkskluzywnych
					+ ", wymiary kontenera: " + szerokoscKontenera + "x"
					+ wysokoscKontenera + "x" + glebokoscKontenera
					+ ", ladownosc kontenera: " + ladownoscKg;
		}
		return "nie ma takiego pojazdu";
	}
}