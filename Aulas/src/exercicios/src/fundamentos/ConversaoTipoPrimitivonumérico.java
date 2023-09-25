package fundamentos;

public class ConversaoTipoPrimitivonumérico {
	
	public static void main(String[] args) {
		
		double a = 1; // conversao inplicita
		System.out.println(a);
		
		float b = 1.12345F; // conversao explicita (CAST);
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
		
	}

}
