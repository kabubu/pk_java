package pk.team.manufactory;


public class VanCarSimulator {

    static int nazwaZmiennej;
    int zwyklaProperty;

    public int getZwyklaProperty() {
        return zwyklaProperty;
    }

    public void setZwyklaProperty(int zwyklaProperty) {
        this.zwyklaProperty = zwyklaProperty;
    }
  

    public VanCarSimulator() {
        System.out.println("Zmienna klasowa ma: " + VanCarSimulator.nazwaZmiennej);
    }

    public static void main(String[] args) {
        VanCarSimulator vanCarSimulator = new VanCarSimulator();
        System.out.println("Property klasy wynosi: " + vanCarSimulator.getZwyklaProperty());
        vanCarSimulator.setZwyklaProperty(3);

        Vehicle van = new VanCar(TypNadwozia.HATCHBACK, 51231232, 777777, 777777, 777777, 777777, 777777, true); 

        Vehicle van2 = new VanCar(TypNadwozia.SEDAN, 1, 2, 3, 4, 5, 6, true); 

        System.out.println(van2.wyswietlPojazd());

        System.out.println(van.sprawdzDostepnosc());
        System.out.println(van2.sprawdzDostepnosc());

        van2.usunSprzedanyEgzemplarz(van2.getId()); 
        System.out.println(van2.sprawdzDostepnosc());


        System.out.println(van.wyswietlPojazd());
        System.out.println(van2.wyswietlPojazd());
        
    }
}
