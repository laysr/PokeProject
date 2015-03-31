package pokeforest;

public class Ally extends Pokemon{
	public void setAllyHPheal() {
		int num = 0;
		while (num <= level) {
			num = num + 1;
			this.allyHP = allyHP + allyHP * 0.5;
		}

	}

	public void setAllyPower(int level) {
		this.level = level;
		enemypower = 0.5 * level;
	}

	public void setAllyHPloss() {
		hploss = allypower * attackPower;
	}

	public void setAllyHPafterattack() {
		allyHP = allyHP - hploss;
	}

}
