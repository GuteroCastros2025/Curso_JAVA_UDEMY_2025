package Fundamentos;

public class Tipos_Primitivos {
	
	public static void main(String[] args) {
		
		// tipos primitivos
		byte anosDeEmpresa = 20;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipos boolean
		boolean estaDeFerias = false;
		
		// tipo caracter
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos/2);
		
		// pontos real
		System.out.println(pontosAcumulados * salario);
		
		System.out.println(id + "ganha ->  " +  salario + " R$");
		System.out.println("Ferias ? " + estaDeFerias );
		System.out.println("status: " + status);
		System.out.println("vendas Acumuladas: " + vendasAcumuladas);
	}

}
