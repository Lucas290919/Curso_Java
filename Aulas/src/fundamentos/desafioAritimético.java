package fundamentos;

public class desafioAritimético {
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		//Desafio
		
		int a = 6;
		var b = 3 + 2;
		var c = 3 * 2;
		var d = 1 - 5;
		var e = 2 - 7;
		var f = 2;
		var g = Math.pow(10, 3);
		
		//Resoluçao
		
		//passo 1
		double h = a * b;
		double i = Math.pow(h, 2);
		double j = i / c;
		
		//paaso 2
		double k = d * e / f;
		double l = Math.pow(k, 2);
		
		//passo 3
		double m = j - l;
		double n = Math.pow(m, 3);
		
		//passo 4
		double o = n / g;
		
		System.out.println((int)o);
				
		
		
		
	}

}
