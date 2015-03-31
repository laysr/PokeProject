package pokeforest;

public class Pokemon {
	public double power, attackPower, hploss, weight, height;
	double HP = 100;
	int level, energy, exp;
	String attackType;
	Move move1, move2, move3, move4;

	public Pokemon() {
		setLevel(1);
		setHPheal();
	}


	public void setPower(int level) {
		this.level = level;
		power = 0.5 * level;
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
		int num = 0;
		while (num <= level) {
			num = num + 1;
			HP = HP + HP * 0.5;
		}
		return HP;
	}
}
