package pokeforest;

public class Move {
	enum MoveType {
		ELECTRIC,
		GRASS,
		FIRE,
		WATER,
		NORMAL
	}
	String name;
	double power;
	MoveType type;
	
	public void thunderbolt() {
		Move thunderbolt = new Move();
		thunderbolt.name = "Thunderbolt!";
		thunderbolt.power = 48;
		thunderbolt.type = MoveType.ELECTRIC;
	}

	public void spark() {
		Move spark = new Move();
		spark.name = "Spark!";
		spark.power = 40;
		spark.type = MoveType.ELECTRIC;
	}

	public void thunder() {
		Move thunder = new Move();
		thunder.name = "Thunder!";
		thunder.power = 50;
		thunder.type = MoveType.ELECTRIC;
	}

	public void quickAttack() {
		Move quickAttack = new Move();
		quickAttack.name = "Quick attack!";
		quickAttack.power = 28;
		quickAttack.type = MoveType.NORMAL;
	}
	
	public void vineWhip() {
		Move vineWhip = new Move();
		vineWhip.name = "Vine whip!";
		vineWhip.power = 26;
		vineWhip.type = MoveType.GRASS;
	}

	public void razorLeaf() {
		Move razorLeaf = new Move();
		razorLeaf.name = "Razor leaf!";
		razorLeaf.power = 46;
		razorLeaf.type = MoveType.GRASS;
	}

	public void megaDrain() {
		Move megaDrain = new Move();
		megaDrain.name = "Mega drain!";
		megaDrain.power = 30;
		megaDrain.type = MoveType.GRASS;
	}

	public void doubleEdge() {
		Move doubleEdge = new Move();
		doubleEdge.name = "Double edge!";
		doubleEdge.power = 18;
		doubleEdge.type = MoveType.NORMAL;
	}
	
	public void ember() {
		Move ember = new Move();
		ember.name = "Ember!";
		ember.power = 40;
		ember.type = MoveType.FIRE;
	}

	public void flamethrower() {
		Move flamethrower = new Move();
		flamethrower.name = "Flamethrower!";
		flamethrower.power = 50;
		flamethrower.type = MoveType.FIRE;
	}

	public void fireSpin() {
		Move fireSpin = new Move();
		fireSpin.name = "Fire spin!";
		fireSpin.power = 20;
		fireSpin.type = MoveType.FIRE;
	}

	public void Scratch() {
		Move scratch = new Move();
		scratch.name = "Scratch!";
		scratch.power = 26;
		scratch.type = MoveType.NORMAL;
	}
	
	public void surf() {
		Move surf = new Move();
		surf.name = "Surf!";
		surf.power = 46;
		surf.type = MoveType.WATER;
	}

	public void hydroPump() {
		Move hydroPump = new Move();
		hydroPump.name = "Hydro pump!";
		hydroPump.power = 50;
		hydroPump.type = MoveType.WATER;
	}

	public void bubbles() {
		Move bubbles = new Move();
		bubbles.name = "Bubbles!";
		bubbles.power = 32;
		bubbles.type = MoveType.WATER;
	}

	public void headbutt() {
		Move headbutt = new Move();
		headbutt.name = "Headbutt!";
		headbutt.power = 24;
		headbutt.type = MoveType.NORMAL;
	}

}
