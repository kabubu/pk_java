package pk.team.manufactory;

public class VanCar extends Vehicle {
	private int szerokoscPaki;
	private int glebokoscPaki;
	private int wysokoscPaki;

	VanCar(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena,
			int pojemnoscBagaznika, int szerokoscPaki, int glebokoscPaki,
			int wysokoscPaki, boolean dostepnyDlaKlientowEkskluzywnych) {
		super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika,
				dostepnyDlaKlientowEkskluzywnych);
		this.szerokoscPaki = szerokoscPaki;
		this.glebokoscPaki = glebokoscPaki;
		this.wysokoscPaki = wysokoscPaki;
	}

	public int getSzerokoscPaki() {
		return szerokoscPaki;
	}

	public void setSzerokoscPaki(int szerokoscPaki) {
		this.szerokoscPaki = szerokoscPaki;
	}

	public int getGlebokoscPaki() {
		return glebokoscPaki;
	}

	public void setGlebokoscPaki(int glebokoscPaki) {
		this.glebokoscPaki = glebokoscPaki;
	}

	public int getWysokoscPaki() {
		return wysokoscPaki;
	}

	public void setWysokoscPaki(int wysokoscPaki) {
		this.wysokoscPaki = wysokoscPaki;
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
					+ ", wymiary kontenera: " + szerokoscPaki + "x"
					+ wysokoscPaki + "x" + glebokoscPaki;
		}
		return "nie ma takiego pojazdu";
	}

}
