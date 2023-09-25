package fundamentos;

public class PrimitivoVsObjetos {
	public static void main(String[] args) {
		
		String s = new String ("texto");
		s.toUpperCase();
		
		//Wrappers sao a versao objetos dos tipos primmitivos !
		int a = 123;
		System.out.println(a);
	}

}
