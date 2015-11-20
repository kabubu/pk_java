package pk.team.manufactory;

import java.util.HashMap;



public class VanCollectionsExample {
    public static void main(String[] args) {


        //stworzmy schowek na auta:
        CarCollectionService carCollectionService = new CarCollectionService();
        final HashMap<Integer, Car> carsCollection = carCollectionService.getCarsCollection();

        //zbudujmy kilka aut:
        for (int i = 0; i < 5; i++) {
            carCollectionService.add(new Car(i, "Auto_" + i));
        }


        System.out.println("Liczba elementow w fabryce: " + carsCollection.size());
        carsCollection.forEach((k, v) -> {
            System.out.println("ID: " + k + " , name: " + v.getName());
        });


        //usuwamy cos 'byId'
        carCollectionService.removeById(2111);

        System.out.println("\n\nPo usunieciu elementu z ID = 2111\n");

        System.out.println("Liczba elementow w fabryce: " + carsCollection.size());

        carsCollection.forEach((k, v) -> {
            System.out.println("ID: " + k + " , name: " + v.getName());
        });

    }

}


class CarCollectionService {       // nadpisana obsluga mapy. Nadmiarowosc na potrzeby przykladu
    private HashMap<Integer, Car> carsCollection = new HashMap<>();

    public HashMap<Integer, Car> getCarsCollection() {
        return carsCollection;
    }


    public void add(Car currentCar) {
        carsCollection.put(currentCar.getId(), currentCar);
    }

    public void removeById(int id) { // tutaj przekazujac id jestesmy w stanie zmienic zawartosc kolekcji pozbywajac sie samochodu o konkretnym ID

        final Car removedCar = carsCollection.remove(id);
        if (removedCar != null) {
            System.out.println("Usunieto auto z id: " + id);
        } else {
            System.out.println("Auto z id: " + " nie istnieje.");
        }

    }

}


class Car {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(int id, String name) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public void removeById(int id){///}  /// tutaj umieszczenie takiej metody nie ma sensu logicznego - nie usuniemy samego siebie / w obrebie metod wywolany na obiekcie w tym
    //kontekscie zmieniamy cechy obiektu
}
