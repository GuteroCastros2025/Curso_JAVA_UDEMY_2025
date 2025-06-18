package Controle;

import java.util.Scanner;

public class Exercicio2_Bissexto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if(bissexto == true) {
			System.out.println(ano + " ano é bissexto ");
		} else {
			System.out.println(ano + " ano NÃO é bissexto ");
		}
				
		entrada.close();
	}

}