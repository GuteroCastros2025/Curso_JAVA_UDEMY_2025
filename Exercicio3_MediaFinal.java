package Controle;

import java.util.Scanner;

public class Exercicio3_MediaFinal {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	System.out.print("Digite a nota parcial 1:");
	double nota1 = entrada.nextDouble();		
	
	System.out.print("Digite a nota parcial 2:");
	double nota2 = entrada.nextDouble();	
			
	double media = (nota1 + nota2) / 2;
	
	if(media >= 7) {
		System.out.println("Sua media foi: " + media + " e você está aprovado");
	} else if (media >= 4) {
		System.out.println("Sua media foi: " + media + " e você está de recuperação");
	} else {
		System.out.println("Sua media foi: " + media + " e você está de reprovado");
	}		
	entrada.close();	;
	}

}
