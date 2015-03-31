package pokeforest;

public class Pikachu extends Pokemon{
	public void thunderbolt() {
		System.out.println("Thunderbolt!");
		attackPower = 48;
		attackType = "electric";
	}

	public void spark() {
		System.out.println("Spark!");
		attackPower = 40;
		attackType = "electric";
	}

	public void thunder() {
		System.out.println("Thunder!");
		attackPower = 50;
		attackType = "electric";
	}

	public void quickAttack() {
		System.out.println("Quick attack!");
		attackPower = 28;
		attackType = "normal";
	}
}
