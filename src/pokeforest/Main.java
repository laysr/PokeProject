package pokeforest;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out
				.println("Escolha o seu pokemon inicial: \n 1: Pikachu \n 2: Bulbasauro \n 3: Charmander \n 4: Squirtle");
		Scanner ent = new Scanner(System.in);
		Random gerador = new Random();
		Trainer ally = new Trainer();
		Trainer enemy = new Trainer();
		boolean goOn = false;
		int choosepkm = ent.nextInt();
		while (goOn == false) {
			if (choosepkm == 1) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Pikachu!");
				Pikachu pikachu = new Pikachu();
				ally.setPokemon1(pikachu);

			} else if (choosepkm == 2) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Bulbasauro!");
				Bulbasaur bulbasaur = new Bulbasaur();
				ally.setPokemon1(bulbasaur);

			} else if (choosepkm == 3) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Charmander!");
				Charmander charmander = new Charmander();
				ally.setPokemon1(charmander);
			} else if (choosepkm == 4) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Squirtle!");
				Squirtle squirtle = new Squirtle();
				ally.setPokemon1(squirtle);

			} else {
				System.out.println("Opção inválida.");

			}
		}
		System.out.println("Seu pokemon está pronto para batalhar, sua primeira baralha está prestes a começar...");
		int battle1 = gerador.nextInt(5);
		while (battle1 == choosepkm || battle1 == 0) {
			battle1 = gerador.nextInt(4);
		}
		if (battle1 == 1) {
			Pikachu pikachu = new Pikachu();
			enemy.setPokemon1(pikachu);
			System.out.println("Seu oponente é um pikachu!");

		} else if (battle1 == 2) {
			Bulbasaur bulbasaur = new Bulbasaur();
			enemy.setPokemon1(bulbasaur);
			System.out.println("Seu oponente é um bulbasauro!");

		} else if (battle1 == 3) {
			Charmander charmander = new Charmander();
			enemy.setPokemon1(charmander);
			System.out.println("Seu oponente é um charmander!");

		} else if (battle1 == 4) {
			Squirtle squirtle = new Squirtle();
			enemy.setPokemon1(squirtle);
			System.out.println("Seu oponente é um squirtle!");

		}
		
		System.out.println("Escolha um ataque, seus ataques são: \n 1:" + ally.getPokemon1().move1.name + "\n 2:" + ally.getPokemon1().move2.name + "\n 3:" + ally.getPokemon1().move3.name + "\n 4:" + ally.getPokemon1().move4.name);
		

	}
}
