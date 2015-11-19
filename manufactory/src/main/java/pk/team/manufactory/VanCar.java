package pk.team.manufactory;

public class VanCar extends Vehicles {
	private int szerokoscPaki;
	private int glebokoscPaki;
	private int wysokoscPaki;
	//dodalbym getery i setery dla tych wartosci tak jak ponizej...


	public int getSzerokoscPaki() {
		return szerokoscPaki;
	}

	public void setSzerokoscPaki(int szerokoscPaki) {
		this.szerokoscPaki = szerokoscPaki;
	}

	VanCar(TypNadwozia typNadowzia, int pojemnoscSilnika, int cena, int pojemnoscBagaznika,
			int szerokoscPaki, int glebokoscPaki, int wysokoscPaki, boolean dostepnyDlaKlientowEkskluzywnych) {
		super(typNadowzia, pojemnoscSilnika, cena, pojemnoscBagaznika, dostepnyDlaKlientowEkskluzywnych);
		this.szerokoscPaki=szerokoscPaki;
		this.glebokoscPaki=glebokoscPaki;
		this.wysokoscPaki=wysokoscPaki;
	}

}
