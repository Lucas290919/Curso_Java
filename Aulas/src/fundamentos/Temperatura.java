package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		int Fahrenheit = 72;
		final double GrausCelcius = (Fahrenheit - 32) * 5/9;
		
		System.out.println(GrausCelcius);
	}

}
