package Controle;

import java.util.Scanner;

public class Exercicio7_SomaNrosPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int somadorDeNumeros = 0;
		int numero = 0;
		
		while(numero >= 0) {
			System.out.println("\n Digite um numero inteiro (ou negativo para sair)");
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("\n A soma até o momento é: %d\n", somadorDeNumeros);
			}	
		}
		entrada.close();
	}	
}
