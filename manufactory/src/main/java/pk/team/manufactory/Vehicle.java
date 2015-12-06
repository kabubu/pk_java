package pk.team.manufactory;

//Fabryka/Salon
//: modul odpowiada za cos co dostarcza samochody do wypozyczalni
//: posiada liste zamowien,
//: raportuje o sprzedazy, rezerwacjach (dluznikach tez), stanie aktualnym do plikow 
//: posiada wlasna liste klientow( w naszym przypadku to Wypozyczalnia)
//: udostepnia listy Wypozyczalni 
//: posiada implementacje znizek i promocji w zaleznosci od klienta(wypozyczalni)
//: tak samo jak w przypadku Klienta, musimy miec mozliwosc CRUD'a dla fabryk (Create, Read, Update, Delete)
//: tak jak powyzej dla samochodow
//: musi odpowiadac na komunikaty Wypozyczalni typu: daj mi liste swoich aut, daj mi auto typu van z roznymi bajerami, chce kupic mercedesa s klasy o podwyzszonym standardzie, na kiedy bedzie smart czerwony itp podobne...
//: powinna sama rozglaszac do Wypozyczalni o zmianie swojego stanu


enum TypNadwozia {
    HATCHBACK, SEDAN, KOMBI, VAN, DOSTAWCZY
}

public abstract class Vehicle implements java.io.Serializable {
    private static int nextId;
    private boolean dostepnoscNaStanie;
    private int pojemnoscSilnika;
    private int cena;
    private int pojemnoscBagaznika;
    private boolean dostepnyDlaKlientowEkskluzywnych;
    private TypNadwozia typNadwozia;
    private int id = nextId++;

    Vehicle(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena, int pojemnoscBagaznika,
            boolean dostepnyDlaKlientowEkskluzywnych) {


        dostepnoscNaStanie = true;
        this.typNadwozia = typNadowzia;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
        this.pojemnoscBagaznika = pojemnoscBagaznika;
        this.dostepnyDlaKlientowEkskluzywnych = dostepnyDlaKlientowEkskluzywnych;

    }

    public TypNadwozia getTypNadwozia() {
        return typNadwozia;
    }

    public void setTypNadwozia(TypNadwozia typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public void usunSprzedanyEgzemplarz(int id) {
        dostepnoscNaStanie = false;
    }

    public void wyswietlPojazd() {
        if (dostepnoscNaStanie) {
            System.out.println("Id: " + getId() + ", dostepnosc na stanie: " + isDostepnoscNaStanie() + ", typ nadwozia: " + getTypNadwozia()
                    + ", pojemnosc silnika: " + getPojemnoscSilnika() + ", pojemnosc bagaznika: " + getPojemnoscBagaznika()
                    + ", cena: " + getCena() + ", dostepny dla klasy ekskluzywnej: " + isDostepnyDlaKlientowEkskluzywnych());
        } else System.out.println("nie ma takiego pojazdu");
    }

    public String sprawdzDostepnosc() {
        if (dostepnoscNaStanie) {
            return "Samochod jest dostepny.";
        }

        return "Samochod niestety nie jest dostepny";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDostepnoscNaStanie() {
        return dostepnoscNaStanie;
    }

    public void setDostepnoscNaStanie(boolean dostepnoscNaStanie) {
        this.dostepnoscNaStanie = dostepnoscNaStanie;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getPojemnoscBagaznika() {
        return pojemnoscBagaznika;
    }

    public void setPojemnoscBagaznika(int pojemnoscBagaznika) {
        this.pojemnoscBagaznika = pojemnoscBagaznika;
    }

    public boolean isDostepnyDlaKlientowEkskluzywnych() {
        return dostepnyDlaKlientowEkskluzywnych;
    }

    public void setDostepnyDlaKlientowEkskluzywnych(
            boolean dostepnyDlaKlientowEkskluzywnych) {
        this.dostepnyDlaKlientowEkskluzywnych = dostepnyDlaKlientowEkskluzywnych;
    }


}




