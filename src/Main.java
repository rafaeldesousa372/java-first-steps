import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double r = 13.335862;
		
		System.out.println("First line using Java, God bless You!");
		System.out.println("Boa tarde Engenheiro Full Stack!");
		System.out.print("First line using Java, God bless You! ");
		System.out.println("Boa tarde Engenheiro Full Stack!");
		
		System.out.println(r);
		System.out.printf("%.2f%n", r); //duas casas decimais
		System.out.printf("%.4f%n", r); //4 casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", r); //3 casas decimais, formato americano
		System.out.printf("RESULTADO = %.2f METROS%n", r);
		
		String nome = "Rafael";
		int idade = 33;
		double rendaBruta = 7007.069;
		System.out.printf("%s tem %d anos e seu salário atual é de R$ %.2f reais", nome, idade, rendaBruta); //interpolação de vários valores numa string

	}
	
}
