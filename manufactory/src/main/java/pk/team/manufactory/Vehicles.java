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


public abstract class Vehicles {
	private static int id=0;
	private static int liczbaSztukNaStanie;
	private String typNadwozia;
	private int pojemnoscSilnika;
	private int cena;
	private int pojemnoscBagaznika;
	protected static boolean dostepnyDlaKlientowEkskluzywnych;
	
	Vehicles (String typNadowzia, int pojemnoscSilnika, int cena, int pojemnoscBagaznika, 
			boolean dostepnyDlaKlientowEkskluzywnych){
		id++;
		liczbaSztukNaStanie++;
		this.typNadwozia=typNadowzia;
		this.pojemnoscSilnika=pojemnoscSilnika;
		this.cena=cena;
		this.pojemnoscBagaznika=pojemnoscBagaznika;
		this.dostepnyDlaKlientowEkskluzywnych=dostepnyDlaKlientowEkskluzywnych;

	}
	
	public void usunSprzedanyEgzemplarz(int id){
		// tu by sie przydal destruktor ale w javie go chyba nie ma...
	}
	
	public String wyswietlPojazd(){
		return "Id: "+id+", liczba sztuk na stanie: "+liczbaSztukNaStanie+", typ nadwozia: "+typNadwozia
				+", pojemnosc silnika: "+pojemnoscSilnika+", pojemnosc bagaznika: "+pojemnoscBagaznika
				+", cena: "+cena+", dostepny dla klasy ekskluzywnej: "+dostepnyDlaKlientowEkskluzywnych;
	}
	
	public String sprawdzDostepnosc(){
		if(liczbaSztukNaStanie>0){
			return "Samochod jest dostepny w liczbie "+liczbaSztukNaStanie+" sztuk.";
		}
		
		return "Samochod niestety nie jest dostepny";
	}
	
	
}




