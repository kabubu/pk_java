package pk.team.manufactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) throws IOException {

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String sciezka = "brak sciezki";

// sprawdzanie czy plik istnieje
        if (args.length > 0) {
            if (fileExist(args[0])) {
                sciezka = args[0];
            } else {
                System.out.println("wprowadziles zla sciezke.");
                String sc;
                int licznik = 0;
                do {
                    System.out.println("wprowadz sciezke ");
                    sc = userInput.readLine();
                    if (fileExist(sc)) {
                        sciezka = sc;
                        break;
                    }
                    licznik++;
                } while (!(fileExist(sc) || licznik == 3));

            }
        } else {
            sciezka = "samochody.txt";
        }

//czytanie pliku
        List<String> inputFromFile = new ArrayList<>();
        String lineOfFileWithVehicles;
        File fileWithVehicles = new File(sciezka);

        try {
            FileReader fileReader = new FileReader(fileWithVehicles);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((lineOfFileWithVehicles = bufferedReader.readLine()) != null) {
                inputFromFile.add(lineOfFileWithVehicles);
            }
            bufferedReader.close();

        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '" + fileWithVehicles + "'");
        }

//wypisywanie zawartosci pliku, linia po lini
        for (int i = 0; i < inputFromFile.size(); i++) {
            System.out.println(inputFromFile.get(i));

        }
    }

    private static boolean fileExist(String sciezka) {
        File plik = new File(sciezka);
        if (plik.exists()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isCorrect(String line) {
        // sprawdzam typ nadwozia, pojemnosc itd... jesli wsztysko ok to zwroc TRUE , wpp false
        line = "123s";
        int k;

        try {
            k = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Podano zla wartosc w pliku: " + line);
            return false;
        }

        return true;
    }
}


//        Vehicle standardCar1 = new StandardCar(TypNadwozia.SEDAN, Integer.parseInt(konkretneAuto), 10000, 400, false);
//        standardCar1.wyswietlPojazd();
//
//        Vehicle sportCar1 = new SportCar(TypNadwozia.SEDAN, 2500, 90000, 0, true, 300);
//        sportCar1.wyswietlPojazd();
//
//        Vehicle truck1 = new Truck(TypNadwozia.DOSTAWCZY, 30000000, 40000, 0, false, 10, 5, 4, 2000);
//        truck1.wyswietlPojazd();
//
//        Vehicle vanCar1 = new VanCar(TypNadwozia.VAN, 3000, 40000, 0, 4, 10, 5, false);
//        vanCar1.wyswietlPojazd();
//
//        Vehicle vanCar2 = new VanCar(TypNadwozia.VAN, 444, 40000, 0, 4, 10, 5, false);
//        vanCar2.wyswietlPojazd();
//
//
//        List<Vehicle> autaOdWojtka = new ArrayList<>();
//        autaOdWojtka.add(sportCar1);
//        autaOdWojtka.add(standardCar1);
//        autaOdWojtka.add(truck1);
//        autaOdWojtka.add(vanCar1);
//        autaOdWojtka.add(vanCar2);
//
//
//        List<Vehicle> napewnoDobreAuta = new ArrayList<>();
//        for (
//                Vehicle oneVehicle
//                : autaOdWojtka)
//
//        {
//            if (oneVehicle.getPojemnoscSilnika() > 400 && oneVehicle.getPojemnoscSilnika() < 10000) {
//                napewnoDobreAuta.add(oneVehicle);
//            }
//        }
//
//        System.out.println("------------------------------------");
//        napewnoDobreAuta.forEach(Vehicle::wyswietlPojazd);


