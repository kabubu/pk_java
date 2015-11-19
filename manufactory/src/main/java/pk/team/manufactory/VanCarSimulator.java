package pk.team.manufactory;


public class VanCarSimulator {

    private int id0 = 3;
    private int id1;
    private static int id = 0;
    private static int id2; //czym sie roznia te cztery wiersze?
    						//ODP static wychodzi poza zakres klasy, 
    						//a te zmienne prywatne bez przypisanej wartosci maja po prostu 0


    public VanCarSimulator() {
        int x = 10;
        this.id = x; // biorac pod uwage czym jest id w VanCarSimulator - co tutaj robimy?
                     //  ODP nadpisales tutaj id, a nie powinienes bo id powinno samo narastac. 
                     //chyba ze chodzi o to zeby bardziej zabezpieczyc id?
        			 //poprawilem id :)
       
    }

    public static void main(String[] args) {

        // niektore komentarze beda podchwytliwe;)

        //w nawiazaniu do klasy Vehicles mnie uczono ze nazwy klas, interfejsow, i w zaleznosci od kontekstu class members piszemy w liczbie pojedynczej - ale to nie jest blad oczywiscie;)
    	// ODP 100% racja
    	
        // w VanCar konstruktorze mamy : super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika, dostepnyDlaKlientowEkskluzywnych) - czy tutaj jest jakis blad?
    	// ODP poprawione :)

//        Vehicles vehhice = new Vehicles(); //czemu nie moge stowrzyc tego obiektu?
    	// ODP bo to klasa abstrakcyjna i nie mozna tworzyc obiektow klas abstrakcynych, ale my nie potrzebujemy tworzyc jej 
    	//obiektow bo bedzie wiecej klas pojazdow. 
    	//Uzylem abstrakcyjnej klasy zeby na sile wcisnac tu wzorzec abstract factory, oczywiscie daloby sie bez abstrakcyjnej :)
    	
//        Vehicles van0 = new VanCar(); // chcemy stworzyc budowanie Van'ow z defaultowymi parametrami?
    	//ODP nie tyle czy chcemy tworzyc ale moim zdaniem mozna zrobic konstruktor z domyslnymi parametrami, 
    	// chociaz nie wiem czy fabryka bedzie produkowac defaultowe samochody? chyba ze to bedzie po prostu biale auto z podstawowym wyposazeniem
    	
        Vehicles van = new VanCar("zlote jajo", 51231232, 777777, 777777, 777777, 777777, 777777, true); //czy moge miec mozliwosc stworzenia takiego auta?
        // ODP nie powinno byc takiej mozliwosci, czy sa maski w javie? bo nawet nie doszedlem do takiego etapu :)
        
        //czy String "zlote_jajo" moglbym zastapic jakas bardziej ograniczona konstrukcja, biorac pod uwage fakt, ze mamy tylko kilka rodzajow nadwozia?
        // ODP mozna stworzyc tryb wyliczeniowy enum albo ArrayList, jak myslisz ma to wiekszy sens? zrobic wtedy kilka opcji do wyboru sedan, kombi, van, hatchback
        
        //czy mam wplyw w tym konstruktorze na dostepnyDlaKlientowEkskluzywnych ?
        ///ODP no nie masz wplywu, zawalilem, ale juz poprawione :P
        Vehicles van2 = new VanCar("sedan", 1, 2, 3, 4, 5, 6, true);  //poprawilem tamte klasy i chyba dziala jak nalezy


        System.out.println(van.sprawdzDostepnosc());
        System.out.println(van2.sprawdzDostepnosc());
        
        van2.usunSprzedanyEgzemplarz(van2.getId());
        System.out.println(van2.sprawdzDostepnosc());
        // stworzylem dwa vany - pytanie czy metoda sprawdzDostepnosc() pokazuje faktyczny stan dostepnosci konkretnego vana?
        // ODP no nie, tu trzeba by bylo sprawdzac dostepnosc danego egzemplarza czyli zamiast 
        // liczbaSztukNaStanie powinno byc boolean dostepnoscSamochodu
        // edit: naprawione



        System.out.println(van.wyswietlPojazd());
        System.out.println(van2.wyswietlPojazd());
        // tutaj wywoluje metode printujaca dany pojazd ale jest cos nie tak z pewnymi parametrami. Ktorymi i czemu tak jest?

        //Poki co tyle, jak masz czas to sie zastanow nad powyzszymi uwagami - nie wnikamy poki co w sens projektu.



    }
}
