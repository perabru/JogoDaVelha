package pvc;

import java.util.Random;
import java.util.Scanner;

import DAO.Placar;

public class PlayerVComputer extends Placar{

	int jogadaH;

	int jogadaC;

	Scanner scan;

	Random rand;

	int sair;
	
	int placarH;
	int placarC;
	int id;
	String nome;

	public PlayerVComputer() {

		jogadaH = 0;
		jogadaC = 0;
		scan = new Scanner(System.in);
		rand = new Random();
		sair = 0;

	}

	public void partida() {

		while (sair != 9) {
			System.out.println("Player 1 - Faça a jogada\n1-Pedra\n2-Tesoura\n3-Papel");
			jogadaH = scan.nextInt();

			System.out.println("O computador está fazendo a jogada dele");
			jogadaC = rand.nextInt(3) + 1;

			System.out.println(jogadaC);

			if (jogadaH == 1 && jogadaC == 1 || jogadaH == 2 && jogadaC == 2 || jogadaH == 3 && jogadaC == 3) {
				System.out.println("Empate");

			} else if (jogadaH == 1 && jogadaC == 2) {
				System.out.println("Player 1 - Venceu\nJogada: " + jogadaH);
				placarH++;

			} else if (jogadaH == 1 && jogadaC == 3) {
				System.out.println("Computador - Venceu\nJogada: " + jogadaC);
				placarC++;
			} else if (jogadaH == 2 && jogadaC == 3) {
				System.out.println("Player 1 - Venceu\nJogada: " + jogadaH);
				placarH++;
			}else {
				System.out.println("Computador - Venceu\nJogada: " + jogadaC);
				placarC++;
			}

			System.out.println("Deseja sair? 9-Sim 8-Não");
			sair = scan.nextInt();
			if(sair == 9 && placarH > placarC) {
				System.out.println("Digite o ID e três letras do nome");
				id= scan.nextInt();
				nome = scan.next();
				try {
					escreverPlacar(id, nome, placarH);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(sair == 9 && placarC > placarH) {
				id = rand.nextInt(10000);
				try {
					escreverPlacar(id, "PC2", placarC);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
