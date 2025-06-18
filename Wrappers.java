package Fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {

		//byte
		Byte b= 100;
		Short s = 1000;
		Integer I = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(I);
		System.out.println(l);
		System.out.println(l * 3);
		System.out.println(l / 3);
		
		Float F = 123.10f;
		System.out.println(F);
		
		Double d = 1234.5678;
		System.out.println(d);		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "....");
		
	}
}
