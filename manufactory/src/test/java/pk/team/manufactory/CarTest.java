package pk.team.manufactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) throws IOException {


        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        String line = "";
        System.out.println("Podaj pojemnosc silnika:");
        do {
            line = in.readLine();
        } while (!isCorrect(line));


        System.out.println("You typed " + line);


        Vehicle standardCar1 = new StandardCar(TypNadwozia.SEDAN, 512312312, 10000, 400, false);
        standardCar1.wyswietlPojazd();

        Vehicle sportCar1 = new SportCar(TypNadwozia.SEDAN, 2500, 90000, 0, true, 300);
        sportCar1.wyswietlPojazd();

        Vehicle truck1 = new Truck(TypNadwozia.DOSTAWCZY, 30000000, 40000, 0, false, 10, 5, 4, 2000);
        truck1.wyswietlPojazd();

        Vehicle vanCar1 = new VanCar(TypNadwozia.VAN, 3000, 40000, 0, 4, 10, 5, false);
        vanCar1.wyswietlPojazd();

        Vehicle vanCar2 = new VanCar(TypNadwozia.VAN, 444, 40000, 0, 4, 10, 5, false);
        vanCar2.wyswietlPojazd();


        List<Vehicle> autaOdWojtka = new ArrayList<>();
        autaOdWojtka.add(sportCar1);
        autaOdWojtka.add(standardCar1);
        autaOdWojtka.add(truck1);
        autaOdWojtka.add(vanCar1);
        autaOdWojtka.add(vanCar2);


        List<Vehicle> napewnoDobreAuta = new ArrayList<>();
        for (Vehicle oneVehicle : autaOdWojtka) {
            if (oneVehicle.getPojemnoscSilnika() > 400 && oneVehicle.getPojemnoscSilnika() < 10000) {
                napewnoDobreAuta.add(oneVehicle);
            }
        }

        System.out.println("------------------------------------");
        napewnoDobreAuta.forEach(Vehicle::wyswietlPojazd);


    }

    private static boolean isCorrect(String line) {
        int x= Integer.parseInt(line);
        if( x > 400 && x < 10000){
            return true;
        } else{
            System.out.println("Zla wartosc, wpisz ponownie");
            return false;
        }
    }
}

