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
	private static int nextId;
	private int id;
	private boolean dostepnoscNaStanie;
	private int pojemnoscSilnika;
	private int cena;
	private int pojemnoscBagaznika;
	private boolean dostepnyDlaKlientowEkskluzywnych;
	
	public enum typNadwozia
	{
		Hatchback("Hatchback");//, Sedan, Kombi, VAN, Dostawczy;
	private String nadwozie;
	private typNadwozia(String s)
	{
		nadwozie=s;
	}
	
	public String toString()
	{
		return nadwozie;
	}
	}
	
	Vehicles (/*String typNadowzia,*/ int pojemnoscSilnika, int cena, int pojemnoscBagaznika, 
			boolean dostepnyDlaKlientowEkskluzywnych){
		nextId++;
		id=nextId;
		dostepnoscNaStanie=true;
		//nadwozie=typNadowzia;
		this.pojemnoscSilnika=pojemnoscSilnika;
		this.cena=cena;
		this.pojemnoscBagaznika=pojemnoscBagaznika;
		this.dostepnyDlaKlientowEkskluzywnych=dostepnyDlaKlientowEkskluzywnych;

	}
	
	public void usunSprzedanyEgzemplarz(int id){
		dostepnoscNaStanie=false;
	}
	
	public String wyswietlPojazd(){
		if(dostepnoscNaStanie){
		return "Id: "+this.id+", dostepnosc na stanie: "+dostepnoscNaStanie+", typ nadwozia: "+typNadwozia
				+", pojemnosc silnika: "+pojemnoscSilnika+", pojemnosc bagaznika: "+pojemnoscBagaznika
				+", cena: "+cena+", dostepny dla klasy ekskluzywnej: "+dostepnyDlaKlientowEkskluzywnych;
		}
		return "nie ma takiego pojazdu";
	}
	
	public String sprawdzDostepnosc(){
		if(dostepnoscNaStanie){
			return "Samochod jest dostepny.";
		}
		
		return "Samochod niestety nie jest dostepny";
	}
	
	public int getId(){
		return id;
	}
	
}




