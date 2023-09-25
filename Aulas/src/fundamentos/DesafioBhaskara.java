package fundamentos;

public class DesafioBhaskara {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = (Math.pow(b, 2) - 4 * a * c); 
		double bhaskarax1 = (-b + Math.sqrt(delta)) / 2;
		double bhaskarax2 = (-b - Math.sqrt(delta)) / 2;
		
		
		
		System.out.println(delta);
		System.out.println(bhaskarax1);
		System.out.println(bhaskarax2);
		
	}
	

}
