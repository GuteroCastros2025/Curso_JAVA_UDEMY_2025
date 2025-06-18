package Controle;

import java.util.Scanner;

public class Exercicio9_MaiorNro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int maiorvalor = 0;
		int contador = 0;
		
		do {
			System.out.println("\nDigite um numero: ");
			int valor = entrada.nextInt();
			
			if(valor > maiorvalor) {
				maiorvalor = valor;
			}
			contador++;
		
		}while (contador != 10) ;
			
		System.out.printf("O maior valor foi: "+ maiorvalor);
		
		entrada.close();
		}
}
