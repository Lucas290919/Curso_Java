package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Comversão implícita
		System.out.println(a);
		
		float b = (float) 1.1234567888888888888888; // conversão explícita
		System.out.println(b);
		
		int c = 340;
		byte d = (byte)c;
		System.out.println(d);
		
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
