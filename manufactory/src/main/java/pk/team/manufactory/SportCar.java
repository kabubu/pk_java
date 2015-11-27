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
        if (isDostepnoscNaStanie()) {
            return "Id: " + getId() + ", dostepnosc na stanie: " + isDostepnoscNaStanie() + ", typ nadwozia: " + getTypNadwozia()
                    + ", pojemnosc silnika: " + getPojemnoscSilnika() + ", pojemnosc bagaznika: " + getPojemnoscBagaznika()
                    + ", cena: " + getCena() + ", dostepny dla klasy ekskluzywnej: " + isDostepnyDlaKlientowEkskluzywnych() + ", moc silnika: " + mocSilnika;
        }
        return "nie ma takiego pojazdu";
    }

}
