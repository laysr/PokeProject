package pokeforest;

public class Bulbasaur extends Pokemon implements Grass {
	public Bulbasaur() {
		weight = 1;
		height = 1;
	}

	public void vineWhip() {
		System.out.println("Vine whip!");
		attackPower = 26;
	}

	public void razorLeaf() {
		System.out.println("Razor leaf!");
		attackPower = 46;
	}

	public void megaDrain() {
		System.out.println("Mega drain!");
		attackPower = 30;
	}

	public void doubleEdge() {
		System.out.println("Double edge!");
		attackPower = 18;
	}

}
