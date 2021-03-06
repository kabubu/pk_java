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


    public void wyswietlPojazd() {
        if (isDostepnoscNaStanie()) {
            System.out.println("Id: " + getId() + ", dostepnosc na stanie: " + isDostepnoscNaStanie() + ", typ nadwozia: " + getTypNadwozia()
                    + ", pojemnosc silnika: " + getPojemnoscSilnika() + "ccm, pojemnosc bagaznika: " + getPojemnoscBagaznika()
                    + "L, cena: " + getCena() + "zł, dostepny dla klasy ekskluzywnej: " + isDostepnyDlaKlientowEkskluzywnych() + ", moc silnika: " + mocSilnika + "KM");
        } else System.out.println("nie ma takiego pojazdu");
    }

}
