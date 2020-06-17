import java.util.Scanner;

import pvp.PlayerVPlayer;
import pvc.PlayerVComputer;
import cvc.ComputerVComputer;

public class Menu {

	// Variáveis Globais
	int opcao;
	Scanner scan;

	PlayerVPlayer pvp = new PlayerVPlayer();
	PlayerVComputer pvc = new PlayerVComputer();
	ComputerVComputer cvc = new ComputerVComputer();
	// Criando o construtor
	public Menu() {

		opcao = 0;
		scan = new Scanner(System.in);

	}

	public void escolha() {

		System.out.println("1-PvP\n2-PvC\n3-CvC\n4-Sair");
		
		opcao = scan.nextInt();

		if (opcao == 1) {
			// Chamar método PvP
			pvp.pJogada();
			
			
			
		} else if (opcao == 2) {
			
			pvc.partida();
			
		} else if (opcao == 3) {
		cvc.parquinhoPegandoFogo();
		} else {
			System.exit(0);
		}
	}

}
