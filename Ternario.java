package Fundamentos;

public class Ternario {

	public static void main(String[] args) {
	 
		double media = 8.0;
		String resultadoParcial = media >= 5.0 ? 
				"Em recuperação" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
				
		System.out.println("O aluno está : " + resultadoFinal);
	
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim. " : "Não. ";
		
		System.out.println("Tem desconto: " + resultado);
		
		
 	}
}
