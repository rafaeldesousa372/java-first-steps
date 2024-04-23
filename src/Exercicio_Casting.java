
public class Exercicio_Casting {
	
	public static void main (String[] args) {
		
		int a, b;
		double resultado;
		double resultadoCasting;
		
		a = 5;
		b = 2;
		
		resultado = a / b;
		resultadoCasting = (double) a / b; //conversão explícita dos valores
		
		System.out.println(resultado);
		System.out.printf("%.3f%n", resultadoCasting);
		
		double d;
		int f;
		
		d = 5.0;
		f = (int) d;
		
		System.out.printf("%n%d", f);
			
	}

}
