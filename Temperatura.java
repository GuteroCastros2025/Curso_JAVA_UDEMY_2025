package Fundamentos;

public class Temperatura {

	
	public static void main(String[] args) {
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheint = 86;
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius + "  *C. ");
	}
}
