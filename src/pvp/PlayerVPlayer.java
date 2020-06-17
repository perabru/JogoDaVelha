package pvp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import DAO.Placar;

public class PlayerVPlayer extends Placar {

	int jogada;
	Scanner scan;
	int sair = 0;
	ArrayList<Integer> arrJogadas = new ArrayList<Integer>();
	int placarJ1, placarJ2;
	int id = 0;
	String nome;

	public PlayerVPlayer() {
		jogada = 0;
		scan = new Scanner(System.in);
	}

	public void pJogada() {
		while (sair != 99) {

			System.out.println("Player 1 - Faça a jogada\n1-Pedra\n2-Tesoura\n3-Papel");

			jogada = scan.nextInt();

			arrJogadas.add(jogada);

			System.out.println("Player 2 - Faça a jogada\n1-Pedra\n2-Tesoura\n3-Papel");

			jogada = scan.nextInt();

			arrJogadas.add(jogada);

			if (arrJogadas.get(0) == 1 && arrJogadas.get(1) == 2) {
				System.out.println("Player 1- Venceu");
				placarJ1++;
			} else if (arrJogadas.get(0) == 1 && arrJogadas.get(1) == 3) {
				System.out.println("Player 2- Venceu");
				placarJ2++;
			} else if (arrJogadas.get(0) == 1 && arrJogadas.get(1) == 1) {
				System.out.println("Houve um empate");
			} else if (arrJogadas.get(0) == 2 && arrJogadas.get(1) == 2) {
				System.out.println("Houve um empate");
			} else if (arrJogadas.get(0) == 3 && arrJogadas.get(1) == 3) {
				System.out.println("Houve um empate");
			}else if (arrJogadas.get(0) == 2 && arrJogadas.get(1) == 1) {
				System.out.println("Player 1- Venceu");
				placarJ1++;
			}else if (arrJogadas.get(0) == 3 && arrJogadas.get(1) == 1) {
				System.out.println("Player 1- Venceu");
				placarJ1++;
			}else if (arrJogadas.get(0) == 1 && arrJogadas.get(1) == 3) {
				System.out.println("Player 2- Venceu");
				placarJ2++;
			}else if (arrJogadas.get(0) == 1 && arrJogadas.get(1) == 2) {
				System.out.println("Player 2- Venceu");
				placarJ2++;
			}

			System.out.println("Deseja sair?\n99-Sim 88-Não");
			sair = scan.nextInt();
			if (sair == 99 && placarJ1 > placarJ2) {

				System.out.println("Digite o ID e três letras do nome");
				id = scan.nextInt();
				nome = scan.next();
				try {
					escreverPlacar(id, nome, placarJ1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (sair == 99 && placarJ2 > placarJ1) {
				System.out.println("Digite o ID e três letras do nome");
				id = scan.nextInt();
				nome = scan.next();
				try {
					escreverPlacar(id, nome, placarJ2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				arrJogadas.clear();
			}
		}

		// 0 e 1
		/*
		 * for(int i: arrJogadas) {
		 * 
		 * System.out.println(i); }
		 */
	}

}
