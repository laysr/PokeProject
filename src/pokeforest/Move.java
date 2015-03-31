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
	int power;
	MoveType type;
	
	 public static Move createThunderbolt() {
		Move thunderbolt = new Move();
		thunderbolt.name = "Thunderbolt";
		thunderbolt.power = 48;
		thunderbolt.type = MoveType.ELECTRIC;
		return thunderbolt;
	 }

	public static Move createSpark() {
		Move spark = new Move();
		spark.name = "Spark";
		spark.power = 40;
		spark.type = MoveType.ELECTRIC;
		return spark;
	}

	public static Move createThunder() {
		Move thunder = new Move();
		thunder.name = "Thunder";
		thunder.power = 50;
		thunder.type = MoveType.ELECTRIC;
		return thunder;
	}

	public static Move createQuickAttack() {
		Move quickAttack = new Move();
		quickAttack.name = "Quick attack";
		quickAttack.power = 28;
		quickAttack.type = MoveType.NORMAL;
		return quickAttack;
	}
	
	public static Move createVineWhip() {
		Move vineWhip = new Move();
		vineWhip.name = "Vine whip";
		vineWhip.power = 26;
		vineWhip.type = MoveType.GRASS;
		return vineWhip;
	}

	public static Move createRazorLeaf() {
		Move razorLeaf = new Move();
		razorLeaf.name = "Razor leaf";
		razorLeaf.power = 46;
		razorLeaf.type = MoveType.GRASS;
		return razorLeaf;
	}

	public static Move createMegaDrain() {
		Move megaDrain = new Move();
		megaDrain.name = "Mega drain";
		megaDrain.power = 30;
		megaDrain.type = MoveType.GRASS;
		return megaDrain;
	}

	public static Move createDoubleEdge() {
		Move doubleEdge = new Move();
		doubleEdge.name = "Double edge";
		doubleEdge.power = 18;
		doubleEdge.type = MoveType.NORMAL;
		return doubleEdge;
	}
	
	public static Move createEmber() {
		Move ember = new Move();
		ember.name = "Ember";
		ember.power = 40;
		ember.type = MoveType.FIRE;
		return ember;
	}

	public static Move createFlamethrower() {
		Move flamethrower = new Move();
		flamethrower.name = "Flamethrower";
		flamethrower.power = 50;
		flamethrower.type = MoveType.FIRE;
		return flamethrower;
	}

	public static Move createFireSpin() {
		Move fireSpin = new Move();
		fireSpin.name = "Fire spin";
		fireSpin.power = 20;
		fireSpin.type = MoveType.FIRE;
		return fireSpin;
	}

	public static Move createScratch() {
		Move scratch = new Move();
		scratch.name = "Scratch";
		scratch.power = 26;
		scratch.type = MoveType.NORMAL;
		return scratch;
	}
	
	public static Move createSurf() {
		Move surf = new Move();
		surf.name = "Surf";
		surf.power = 46;
		surf.type = MoveType.WATER;
		return surf;
	}

	public static Move createHydroPump() {
		Move hydroPump = new Move();
		hydroPump.name = "Hydro pump";
		hydroPump.power = 50;
		hydroPump.type = MoveType.WATER;
		return hydroPump;
	}

	public static Move createBubbles() {
		Move bubbles = new Move();
		bubbles.name = "Bubbles";
		bubbles.power = 32;
		bubbles.type = MoveType.WATER;
		return bubbles;
	}

	public static Move createHeadbutt() {
		Move headbutt = new Move();
		headbutt.name = "Headbutt";
		headbutt.power = 24;
		headbutt.type = MoveType.NORMAL;
		return headbutt;
	}

}
