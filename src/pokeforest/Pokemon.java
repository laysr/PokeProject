package pokeforest;

public class Pokemon {
	public double weight, height;
	int HPheal = 100, HP, level, power, energy, exp;
	String name;
	Move move1, move2, move3, move4;

	public Pokemon() {
		setLevel(1);
		setHPheal();
	}


	public void setPower() {
		power = 5 * (level + 1) / 10;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double setHPheal() {
		int num = 1;
		while (num <= level) {
			num = num + 1;
			HPheal = HPheal + HPheal * 5 / 10;
		}
		return HPheal;
	}
}
