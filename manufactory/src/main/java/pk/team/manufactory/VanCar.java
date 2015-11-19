package pk.team.manufactory;

public class VanCar extends Vehicles {
	private int szerokoscPaki;
	private int glebokoscPaki;
	private int wysokoscPaki;
	
	VanCar(String typNadowzia, int pojemnoscSilnika, int cena, int pojemnoscBagaznika, 
			int szerokoscPaki, int glebokoscPaki, int wysokoscPaki) {
		super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika, dostepnyDlaKlientowEkskluzywnych);
		this.szerokoscPaki=szerokoscPaki;
		this.glebokoscPaki=glebokoscPaki;
		this.wysokoscPaki=wysokoscPaki;
	}

}
