package Controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6JogoAdvinhacao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando numero entre 0 e 100 \n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			
			System.out.println("Começou o jogo! Será que consegue me vencer ??");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if(numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado é maior que %d\n\n", numero);
				}else {
					System.out.printf("\nParabéns! Você acertou o numero em %d tentativas! \n\n", tentativas);
				break;
				}
			}while (tentativas != 10);
			
			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar");
			continuar  = entrada.nextInt();
			
		}while (continuar != 0);
			
		entrada.close();
	}

}
