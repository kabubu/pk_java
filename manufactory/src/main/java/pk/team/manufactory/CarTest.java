package pk.team.manufactory;

public class CarTest {
	public static void main(String[] args) {
		Vehicle standardCar1 = new StandardCar(TypNadwozia.SEDAN, 1400, 10000, 400, false);
		System.out.println(standardCar1.wyswietlPojazd());
		Vehicle sportCar1 = new SportCar(TypNadwozia.SEDAN,2500,90000,0,true,300);
		System.out.println(sportCar1.wyswietlPojazd());
		Vehicle truck1=new Truck(TypNadwozia.DOSTAWCZY,3000,40000,0,false,10,5,4,2000);
		System.out.println(truck1.wyswietlPojazd());
		Vehicle vanCar1 = new VanCar(TypNadwozia.VAN,3000,40000,0,4,10,5,false);
		System.out.println(vanCar1.wyswietlPojazd());
	}
}
