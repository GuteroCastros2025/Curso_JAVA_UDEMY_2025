package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
	
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
	
		Integer UltimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(UltimoNumero1);
		
		String ultimaLinguagem2 = (String) ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
	
		Integer UltimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(UltimoNumero2);
	}
}