package Controle;

import java.util.Scanner;

public class Exercicio1_PAR {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O numero " + numero + "está entre 0 e 10 e é par");
			} else {
				System.out.println("O numero " + numero + "está entre 0 e 10 e NÃO é par");
			}
			
		} else {
			System.out.println("O numero " + numero + " NÃO está entre 0 e 10");
		}
			
		entrada.close();
	}
	

}
