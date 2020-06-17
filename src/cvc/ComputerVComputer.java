package cvc;

import java.util.Random;

import DAO.Placar;

public class ComputerVComputer extends Placar{

	int jogadaC1;
	int jogadaC2;
	Random rand;

	int placarC1;
	int placarC2;
	int opcao;

	
	int id;

	public ComputerVComputer() {
		jogadaC1 = 0;
		jogadaC2 = 0;
		placarC1 = 0;
		placarC2 = 0;
		opcao = 0;
		rand = new Random();

	}

	public void parquinhoPegandoFogo() {

		while (opcao != 99) {

			for (int i = 0; i < 100; i++) {
				jogadaC1 = rand.nextInt(3) + 1;
				jogadaC2 = rand.nextInt(3) + 1;

				System.out.println("Jogadas\n1-Pedra\n2-Tesoura\n3-Papel");

				if (jogadaC1 == 1 && jogadaC2 == 1 || jogadaC1 == 2 && jogadaC2 == 2
						|| jogadaC1 == 3 && jogadaC2 == 3) {
					System.out.println("Empate entre as máquinas");

				} else if (jogadaC1 == 1 && jogadaC2 == 2) {
					System.out.println("Computador 1 Venceu");
					placarC1++;

				} else if (jogadaC1 == 2 && jogadaC2 == 3) {
					System.out.println("Computador 1 Venceu");
					placarC1++;
				} else if (jogadaC1 == 3 && jogadaC2 == 1) {
					System.out.println("Computador 1 Venceu");
					placarC1++;
				} else {
					System.out.println("Computador 2 Venceu");
					placarC2++;

				}
			}

			if (placarC1 > placarC2) {
				opcao = 99;
				System.out.println("Placar C1: " + placarC1 + "\n" + "Placar C2: " + placarC2);
				
				try {
					id = rand.nextInt(1000);
					escreverPlacar(id, "PC1", placarC1);

				} catch (Exception ex) {
					System.out.println("Não foi possível salvar. Erro - " + ex);
				}

			} else if(placarC2 > placarC1){
				opcao = 99;
				System.out.println("Placar C1: " + placarC1 + "\n" + "Placar C2: " + placarC2);
				
				try {
					id = rand.nextInt(1000);
					escreverPlacar(id, "PC2", placarC2);
				} catch (Exception ex) {
					System.out.println("Não foi possível salvar. Erro - " + ex);
				}
			}

		}

	}

}
