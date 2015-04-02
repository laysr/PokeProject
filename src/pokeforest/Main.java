package pokeforest;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escolha o seu pokemon inicial: \n 1: Pikachu \n 2: Bulbasauro \n 3: Charmander \n 4: Squirtle");
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
				ally.getPokemon1().name = "Pikachu";

			} else if (choosepkm == 2) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Bulbasauro!");
				Bulbasaur bulbasaur = new Bulbasaur();
				ally.setPokemon1(bulbasaur);
				ally.getPokemon1().name = "Bulbasauro";

			} else if (choosepkm == 3) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Charmander!");
				Charmander charmander = new Charmander();
				ally.setPokemon1(charmander);
				ally.getPokemon1().name = "Charmander";
			} else if (choosepkm == 4) {
				goOn = true;

				System.out.println("Parabéns, você recebeu uma pokeball com um Squirtle!");
				Squirtle squirtle = new Squirtle();
				ally.setPokemon1(squirtle);
				ally.getPokemon1().name = "Squirtle";

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
			enemy.getPokemon1().name = "Pikachu";
			System.out.println("Seu oponente é um pikachu!");

		} else if (battle1 == 2) {
			Bulbasaur bulbasaur = new Bulbasaur();
			enemy.setPokemon1(bulbasaur);
			enemy.getPokemon1().name = "Bulbasauro";
			System.out.println("Seu oponente é um bulbasauro!");

		} else if (battle1 == 3) {
			Charmander charmander = new Charmander();
			enemy.setPokemon1(charmander);
			enemy.getPokemon1().name = "Charmander";
			System.out.println("Seu oponente é um charmander!");

		} else if (battle1 == 4) {
			Squirtle squirtle = new Squirtle();
			enemy.setPokemon1(squirtle);
			enemy.getPokemon1().name = "Squirtle";
			System.out.println("Seu oponente é um squirtle!");

		}
		
		int enemyhploss, allyhploss;
		ally.getPokemon1().setLevel(1);
		ally.getPokemon1().setPower();
		enemy.getPokemon1().setLevel(1);
		enemy.getPokemon1().setPower();
		ally.getPokemon1().HP = ally.getPokemon1().HPheal;
		enemy.getPokemon1().HP = enemy.getPokemon1().HPheal;
		System.out.println("Seu pokemon possui " + ally.getPokemon1().HP + " HP");
		while (ally.getPokemon1().HP > 0 && enemy.getPokemon1().HP > 0) {
			System.out.println("Escolha um ataque, seus ataques são: \n 1:" + ally.getPokemon1().move1.name + "\n 2:" + ally.getPokemon1().move2.name + "\n 3:" + ally.getPokemon1().move3.name + "\n 4:" + ally.getPokemon1().move4.name);
			int chooseMove = ent.nextInt();
			if (chooseMove == 1){
				enemyhploss = ally.getPokemon1().power * ally.getPokemon1().move1.power;
				enemy.getPokemon1().HP = enemy.getPokemon1().HP - enemyhploss;
				System.out.println(ally.getPokemon1().move1.name + "!\n" + "Seu " + ally.getPokemon1().name + " causou " + enemyhploss + " de dano! \n" + enemy.getPokemon1().name + " ainda possui " + enemy.getPokemon1().HP + " HP!");
				}
			else if (chooseMove == 2){
				enemyhploss = ally.getPokemon1().power * ally.getPokemon1().move2.power;
				enemy.getPokemon1().HP = enemy.getPokemon1().HP - enemyhploss;
				System.out.println("Seu " + ally.getPokemon1().name + " causou " + enemyhploss + " de dano! \n" + enemy.getPokemon1().name + " ainda possui " + enemy.getPokemon1().HP + " HP!");
				}
			else if (chooseMove == 3){
				enemyhploss = ally.getPokemon1().power * ally.getPokemon1().move3.power;
				enemy.getPokemon1().HP = enemy.getPokemon1().HP - enemyhploss;
				System.out.println("Seu " + ally.getPokemon1().name + " causou " + enemyhploss + " de dano! \n" + enemy.getPokemon1().name + " ainda possui " + enemy.getPokemon1().HP + " HP!");
				}
			else if (chooseMove == 4){
				enemyhploss = ally.getPokemon1().power * ally.getPokemon1().move4.power;
				enemy.getPokemon1().HP = enemy.getPokemon1().HP - enemyhploss;
				System.out.println("Seu " + ally.getPokemon1().name + " causou " + enemyhploss + " de dano! \n" + enemy.getPokemon1().name + " ainda possui " + enemy.getPokemon1().HP + " HP!");
				}
			else {
				System.out.println("Opção inválida");
			}
			int chooseMove2 = gerador.nextInt(5);
			while (chooseMove2 == 0) {
				chooseMove2 = gerador.nextInt(5);
				}
				if (chooseMove2 == 1){
					allyhploss = enemy.getPokemon1().power * enemy.getPokemon1().move1.power;
					ally.getPokemon1().HP = ally.getPokemon1().HP - allyhploss;
					System.out.println(enemy.getPokemon1().move1.name + "!\n" + "Seu oponente " + enemy.getPokemon1().name + " causou " + allyhploss + " de dano! \n" + ally.getPokemon1().name + " ainda possui " + ally.getPokemon1().HP + " HP!");
					chooseMove2 = 0;
					}
				else if (chooseMove2 == 2){
					allyhploss = enemy.getPokemon1().power * enemy.getPokemon1().move2.power;
					ally.getPokemon1().HP = ally.getPokemon1().HP - allyhploss;
					System.out.println(enemy.getPokemon1().move1.name + "!\n" + "Seu oponente " + enemy.getPokemon1().name + " causou " + allyhploss + " de dano! \n" + ally.getPokemon1().name + " ainda possui " + ally.getPokemon1().HP + " HP!");
					chooseMove2 = 0;
					}
				else if (chooseMove2 == 3){
					allyhploss = enemy.getPokemon1().power * enemy.getPokemon1().move3.power;
					ally.getPokemon1().HP = ally.getPokemon1().HP - allyhploss;
					System.out.println(enemy.getPokemon1().move1.name + "!\n" + "Seu oponente " + enemy.getPokemon1().name + " causou " + allyhploss + " de dano! \n" + ally.getPokemon1().name + " ainda possui " + ally.getPokemon1().HP + " HP!");
					chooseMove2 = 0;
					}
				else if (chooseMove2 == 4){
					allyhploss = enemy.getPokemon1().power * enemy.getPokemon1().move4.power;
					ally.getPokemon1().HP = ally.getPokemon1().HP - allyhploss;
					System.out.println(enemy.getPokemon1().move1.name + "!\n" + "Seu oponente " + enemy.getPokemon1().name + " causou " + allyhploss + " de dano! \n" + ally.getPokemon1().name + " ainda possui " + ally.getPokemon1().HP + " HP!");
					chooseMove2 = 0;
					}			
		}
		
			
					
		}

	}

