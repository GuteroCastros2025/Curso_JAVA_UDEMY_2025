package Generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares <Integer, String> resultadoconcurso = new Pares<>();
		resultadoconcurso.adicionar(1, "Maria");
		resultadoconcurso.adicionar(2, "Pedro");
		resultadoconcurso.adicionar(3, "Gui");
		resultadoconcurso.adicionar(4, "Ana");
		resultadoconcurso.adicionar(2, "Rebeca");
		
		System.out.println(resultadoconcurso.getValor(1));
		System.out.println(resultadoconcurso.getValor(4));
		System.out.println(resultadoconcurso.getValor(2));
	
	}
}