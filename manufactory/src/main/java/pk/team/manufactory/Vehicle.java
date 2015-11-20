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
    HATCHBACK, SEDAN, KOMBI, VAN, DOSTAWCZY;
}

public abstract class Vehicle {
    private static int nextId;
    protected int id;
    protected boolean dostepnoscNaStanie;
    protected int pojemnoscSilnika;
    protected int cena;
    protected int pojemnoscBagaznika;
    protected boolean dostepnyDlaKlientowEkskluzywnych;
    protected TypNadwozia typNadwozia;

    public TypNadwozia getTypNadwozia() {
        return typNadwozia;
    }

    public void setTypNadwozia(TypNadwozia typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    Vehicle(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena, int pojemnoscBagaznika,
             boolean dostepnyDlaKlientowEkskluzywnych) {
        nextId++;
        id = nextId;
        dostepnoscNaStanie = true;
        this.typNadwozia = typNadowzia;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
        this.pojemnoscBagaznika = pojemnoscBagaznika;
        this.dostepnyDlaKlientowEkskluzywnych = dostepnyDlaKlientowEkskluzywnych;

    }

    public void usunSprzedanyEgzemplarz(int id) {
        dostepnoscNaStanie = false;
    }

    public String wyswietlPojazd() {
        if (dostepnoscNaStanie) {
            return "Id: " + this.id + ", dostepnosc na stanie: " + dostepnoscNaStanie + ", typ nadwozia: " + getTypNadwozia()
                    + ", pojemnosc silnika: " + pojemnoscSilnika + ", pojemnosc bagaznika: " + pojemnoscBagaznika
                    + ", cena: " + cena + ", dostepny dla klasy ekskluzywnej: " + dostepnyDlaKlientowEkskluzywnych;
        }
        return "nie ma takiego pojazdu";
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




