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


        for (String anInputFromFile : inputFromFile) {
                      List<String> lineToObject = Arrays.asList(anInputFromFile.split("\\s*,\\s*"));

            for (String aLineToObject : lineToObject) {
                System.out.print(aLineToObject + ".......");

            }
            System.out.println("size: " + lineToObject.size());
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