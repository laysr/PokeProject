package pokeforest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escolha o seu pokemon inicial: \n A: Pikachu \n B: Bulbasauro \n C: Charmander \n D: Squirtle");
		Pikachu pikachu = new Pikachu();
		Bulbasaur bulbasaur = new Bulbasaur();
		Charmander charmander = new Charmander();
		Squirtle squirtle = new Squirtle();
		Scanner ent = new Scanner(System.in);
		boolean goOn = false;
		while (goOn == false) {
			String choosepkm = ent.next();
			if (choosepkm.equals("a") || choosepkm.equals("A")) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Pikachu!");

			} else if (choosepkm.equals("b") || choosepkm.equals("B")) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Bulbasauro!");

			} else if (choosepkm.equals("c") || choosepkm.equals("C")) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Charmander!");

			} else if (choosepkm.equals("d") || choosepkm.equals("D")) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Squirtle!");

			} else {
				System.out.println("Opção inválida.");

			}
		}
	}
}
