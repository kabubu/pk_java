package pk.team.manufactory;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<Vehicle> listaZPojazdami = new ArrayList<>();
        for (String anInputFromFile : inputFromFile) {
            List<String> lineToObject = Arrays.asList(anInputFromFile.split("\\s*,\\s*"));
            lineToObject.set(1, lineToObject.get(1).toUpperCase());

            if (enumTypeExist(lineToObject.get(1))) {
                switch (lineToObject.get(0)) {
                    case "StandardCar":
                        listaZPojazdami.add(new StandardCar(TypNadwozia.valueOf(lineToObject.get(1)), Integer.parseInt(lineToObject.get(2)), Integer.parseInt(lineToObject.get(3)),
                                Integer.parseInt(lineToObject.get(4)), Boolean.parseBoolean(lineToObject.get(5))));
                        break;
                    case "SportCar":
                        listaZPojazdami.add(new SportCar(TypNadwozia.valueOf(lineToObject.get(1)), Integer.parseInt(lineToObject.get(2)), Integer.parseInt(lineToObject.get(3)),
                                Integer.parseInt(lineToObject.get(4)), Boolean.parseBoolean(lineToObject.get(5)), Integer.parseInt(lineToObject.get(6))));
                        break;
                    case "Truck":
                        listaZPojazdami.add(new Truck(TypNadwozia.valueOf(lineToObject.get(1)), Integer.parseInt(lineToObject.get(2)), Integer.parseInt(lineToObject.get(3)),
                                Integer.parseInt(lineToObject.get(4)), Boolean.parseBoolean(lineToObject.get(5)), Integer.parseInt(lineToObject.get(6)), Integer.parseInt(lineToObject.get(7)),
                                Integer.parseInt(lineToObject.get(8)), Integer.parseInt(lineToObject.get(9))));
                        break;
                    case "VanCar":
                        listaZPojazdami.add(new VanCar(TypNadwozia.valueOf(lineToObject.get(1)), Integer.parseInt(lineToObject.get(2)), Integer.parseInt(lineToObject.get(3)),
                                Integer.parseInt(lineToObject.get(4)), Integer.parseInt(lineToObject.get(5)), Integer.parseInt(lineToObject.get(6)), Integer.parseInt(lineToObject.get(7)),
                                Boolean.parseBoolean(lineToObject.get(8))));
                        break;

                }
            }
        }
        //listaZPojazdami.forEach(Vehicle::wyswietlPojazd);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("samochodyOutput.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaZPojazdami.get(0));
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }





        Vehicle e;

        try {
            FileInputStream fileIn = new FileInputStream("samochodyOutput.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Vehicle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Nasze wyniki:");
        e.wyswietlPojazd();
    }


    private static boolean enumTypeExist(String enumGot) {
        for (TypNadwozia typDoSprawdzenia : TypNadwozia.values()) {
            if (enumGot.equals(typDoSprawdzenia.toString())) {
                return true;
            }

        }
        return false;
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