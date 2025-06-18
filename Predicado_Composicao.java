package Lambdas;

import java.util.function.Predicate;

public class Predicado_Composicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 ==0;
		Predicate<Integer> IsTresDigitos = 
				num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(IsTresDigitos).negate().test(123));
		System.out.println(isPar.or(IsTresDigitos).test(123));
		
	}

}
