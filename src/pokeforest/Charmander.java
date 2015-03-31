package pokeforest;

public class Charmander extends Pokemon implements Fire {
	public Charmander() {
		height = 0.6;
		weight = 8.5;
		move1 = Move.createEmber();
		move2 = Move.createFlamethrower();
		move3 = Move.createFireSpin();
		move4 = Move.createScratch();
	}

}
