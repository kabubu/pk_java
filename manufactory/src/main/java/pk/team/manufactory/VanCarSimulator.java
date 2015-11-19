package pk.team.manufactory;


public class VanCarSimulator {

    private int id0 = 3;
    private int id1;
    private static int id = 0;
    private static int id2; //czym sie roznia te cztery wiersze?


    public VanCarSimulator() {
        int x = 10;
        this.id = x; // biorac pod uwage czym jest id w VanCarSimulator - co tutaj robimy?

    }

    public static void main(String[] args) {

        // niektore komentarze beda podchwytliwe;)

        //w nawiazaniu do klasy Vehicles mnie uczono ze nazwy klas, interfejsow, i w zaleznosci od kontekstu class members piszemy w liczbie pojedynczej - ale to nie jest blad oczywiscie;)
        // w VanCar konstruktorze mamy : super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika, dostepnyDlaKlientowEkskluzywnych) - czy tutaj jest jakis blad?

//        Vehicles vehhice = new Vehicles(); //czemu nie moge stowrzyc tego obiektu?
//        Vehicles van0 = new VanCar(); // chcemy stworzyc budowanie Van'ow z defaultowymi parametrami?
        Vehicles van = new VanCar("zlote jajo", 51231232, 777777, 777777, 777777, 777777, 777777); //czy moge miec mozliwosc stworzenia takiego auta?
        //czy String "zlote_jajo" moglbym zastapic jakas bardziej ograniczona konstrukcja, biorac pod uwage fakt, ze mamy tylko kilka rodzajow nadwozia?
        //czy mam wplyw w tym konstruktorze na dostepnyDlaKlientowEkskluzywnych ?

        Vehicles van2 = new VanCar("sedan", 1, 2, 3, 4, 5, 6);


        System.out.println(van.sprawdzDostepnosc());
        System.out.println(van2.sprawdzDostepnosc());
        // stworzylem dwa vany - pytanie czy metoda sprawdzDostepnosc() pokazuje faktyczny stan dostepnosci konkretnego vana?



        System.out.println(van.wyswietlPojazd());
        System.out.println(van2.wyswietlPojazd());
        // tutaj wywoluje metode printujaca dany pojazd ale jest cos nie tak z pewnymi parametrami. Ktorymi i czemu tak jest?

        //Poki co tyle, jak masz czas to sie zastanow nad powyzszymi uwagami - nie wnikamy poki co w sens projektu.



    }
}
