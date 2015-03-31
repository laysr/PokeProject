package pokeforest;

public class Enemy extends Pokemon {
	public void setEnemyHPheal() {
		int num = 0;
		while (num <= level) {
			num = num + 1;
			this.enemyHP = enemyHP + enemyHP * 0.5;
		}

	}

	public void setEnemyPower(int level) {
		this.level = level;
		enemypower = 0.5 * level;
	}

	public void setEnemyHPloss() {
		hploss = allypower * attackPower;
	}

	public void setEnemyHPafterattack() {
		enemyHP = enemyHP - hploss;
	}

}
