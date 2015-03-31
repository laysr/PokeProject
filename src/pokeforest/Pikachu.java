package pokeforest;

public class Pikachu extends Pokemon{
	public void thundershock() {
		System.out.println("Thundershock!");
		attackPower = 48;
	}

	public void ironTail() {
		System.out.println("Iron tail!");
		attackPower = 44;
	}

	public void bite() {
		System.out.println("Bite!");
		attackPower = 38;
	}

	public void doubleEdge() {
		System.out.println("Double edge!");
		attackPower = 18;
	}
}
