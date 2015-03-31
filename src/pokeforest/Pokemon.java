package pokeforest;

public class Pokemon {
	public double weight, height;
	int HP = 100, hploss, power, attackPower, level, energy, exp;
	String attackType;
	Move move1, move2, move3, move4;

	public Pokemon() {
		setLevel(1);
		setHPheal();
	}


	public void setPower(int level) {
		this.level = level;
		power = 5 * level / 10;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setHPloss() {
		hploss = power * attackPower;
	}


	public void setHPafterattack() {
		HP = HP - hploss;
	}

	

	public double setHPheal() {
		int num = 1;
		while (num <= level) {
			num = num + 1;
			HP = HP + HP * 5 / 10;
		}
		return HP;
	}
}
