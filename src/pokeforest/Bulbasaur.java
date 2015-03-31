package pokeforest;

public class Bulbasaur extends Pokemon implements Grass {
	public Bulbasaur() {
		weight = 1;
		height = 1;
	}

	public void vineWhip() {
		System.out.println("Vine whip!");
		attackPower = 26;
		attackType = "grass";
	}

	public void razorLeaf() {
		System.out.println("Razor leaf!");
		attackPower = 46;
		attackType = "grass";
	}

	public void megaDrain() {
		System.out.println("Mega drain!");
		attackPower = 30;
		attackType = "grass";
	}

	public void doubleEdge() {
		System.out.println("Double edge!");
		attackPower = 18;
		attackType = "normal";
	}

}
