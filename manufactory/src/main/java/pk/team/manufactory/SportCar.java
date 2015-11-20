package pk.team.manufactory;

public class SportCar extends Vehicle {
	private int mocSilnika;

	public SportCar(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena,
			int pojemnoscBagaznika, boolean dostepnyDlaKlientowEkskluzywnych,
			int mocSilnika) {
		super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika,
				dostepnyDlaKlientowEkskluzywnych);
		this.setMocSilnika(mocSilnika);

	}

	public int getMocSilnika() {
		return mocSilnika;
	}

	public void setMocSilnika(int mocSilnika) {
		this.mocSilnika = mocSilnika;
	}
	
	
    public String wyswietlPojazd() {
        if (dostepnoscNaStanie) {
            return "Id: " + this.id + ", dostepnosc na stanie: " + dostepnoscNaStanie + ", typ nadwozia: " + getTypNadwozia()
                    + ", pojemnosc silnika: " + pojemnoscSilnika + ", pojemnosc bagaznika: " + pojemnoscBagaznika
                    + ", cena: " + cena + ", dostepny dla klasy ekskluzywnej: " + dostepnyDlaKlientowEkskluzywnych+", moc silnika: "+mocSilnika;
        }
        return "nie ma takiego pojazdu";
    }

}
