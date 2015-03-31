package pokeforest;

public class Bulbasaur extends Pokemon implements Grass {
	public Bulbasaur() {
		weight = 1;
		height = 1;
		move1 = Move.createVineWhip();
		move2 = Move.createRazorLeaf();
		move3 = Move.createMegaDrain();
		move4 = Move.createDoubleEdge();
	}

	
}
