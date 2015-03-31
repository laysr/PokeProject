package pokeforest;

public class Pokemon {
	public double allypower, enemypower, attackPower, hploss, weight, height;
	public int level, exp, energy;
	double allyHP = 100, enemyHP = 100;

	public Pokemon() {
		setLevel(1);
		setAllyHPheal();
	}

	public void setEnemyPower(int level) {
		this.level = level;
		enemypower = 0.5 * level;
	}

	public void setAllyPower(int level) {
		this.level = level;
		allypower = 0.5 * level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setEnemyHPloss() {
		hploss = allypower * attackPower;
	}

	public void setAllyHPloss() {
		hploss = enemypower * attackPower;
	}

	public void setAllyHPafterattack() {
		allyHP = allyHP - hploss;
	}

	public void setEnemyHPafterattack() {
		enemyHP = enemyHP - hploss;
	}

	public void setAllyHPheal() {
		int num = 0;
		while (num <= level) {
			num = num + 1;
			allyHP = allyHP + allyHP * 0.5;
		}
	}

	public void setEnemyHPheal() {
		int num = 0;
		while (num <= level) {
			num = num + 1;
			enemyHP = enemyHP + enemyHP * 0.5;
		}
	}

	public void attack() {

	}
}
