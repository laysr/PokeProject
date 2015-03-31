package pokeforest;

public class Squirtle extends Pokemon{
	public void surf() {
		System.out.println("Surf!");
		attackPower = 46;
		attackType = "water";
	}

	public void hydroPump() {
		System.out.println("Hydro pump!");
		attackPower = 50;
		attackType = "water";
	}

	public void bubbles() {
		System.out.println("Bubles!");
		attackPower = 32;
		attackType = "water";
	}

	public void headbutt() {
		System.out.println("Headbutt!");
		attackPower = 24;
		attackType = "normal";
	}
}
