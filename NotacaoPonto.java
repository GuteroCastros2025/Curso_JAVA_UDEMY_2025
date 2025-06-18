package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Bom dia X ";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");		
		
		
		System.out.println(s);
		
		String x = ("leo".toUpperCase());
		System.out.println(x);
		
		String y ="Bom dia X "
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!");
		
		System.out.println(y);
		
		//tipos primitivos não tem "."
		int a = 3;
		System.out.println(a);
	}

}
