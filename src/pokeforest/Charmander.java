package pokeforest;

public class Charmander extends Pokemon implements Fire {
	public Charmander() {
		height = 0.6;
		weight = 8.5;
	}

	public void ember() {
		System.out.println("Ember!");
		attackPower = 40;
		attackType = "fire";
	}

	public void flamethrower() {
		System.out.println("Flamethrower!");
		attackPower = 50;
		attackType = "fire";
	}

	public void bite() {
		System.out.println("Bite!");
		attackPower = 38;
		attackType = "normal";
	}

	public void Scratch() {
		System.out.println("Scratch!");
		attackPower = 26;
		attackType = "normal";
	}

}
