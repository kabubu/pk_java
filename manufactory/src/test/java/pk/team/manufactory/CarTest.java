package pk.team.manufactory;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {


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



        List<Vehicle> salonDobrychSamochodow = new ArrayList<>();
        salonDobrychSamochodow.add(sportCar1);
        salonDobrychSamochodow.add(standardCar1);
        salonDobrychSamochodow.add(truck1);
        salonDobrychSamochodow.add(vanCar1);
        salonDobrychSamochodow.add(vanCar2);




        List<Vehicle> napewnoDobreAuta = new ArrayList<>();
        List<Vehicle> napewnoZleAuta = new ArrayList<>();
        for(Vehicle oneVehicle : salonDobrychSamochodow){
            if(oneVehicle.getPojemnoscSilnika() > 400 && oneVehicle.getPojemnoscSilnika() < 10000){
                napewnoDobreAuta.add(oneVehicle);
            } else{
                napewnoZleAuta.add(oneVehicle);
            }
        }

        System.out.println("foreach skrocony dobre auta ------------------------------------");
        napewnoDobreAuta.forEach(Vehicle::wyswietlPojazd);

        System.out.println("foreach zle auta -----------------------------------------------");
        napewnoZleAuta.forEach(el -> {
            el.wyswietlPojazd();
        });




    }
}

