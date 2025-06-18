package Controle;

import java.util.Scanner;

public class Exercicio5_NroPrimoSwitch {

	
public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in) ;
		
		System.out.println("Digite um numero para verificar se é primo:");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if(numero % 1 == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + numero + " é primo");
			break;
			
		default:
			System.out.println("O numero " + numero + " NÃO é primo");
		}
		
		entrada.close();
	}
}
