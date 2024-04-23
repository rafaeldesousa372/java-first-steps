import java.util.Scanner;

public class Entrada_Dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//números inteiros;
		//int x; 
		//x = sc.nextInt();
		//System.out.println("Você digitou: " + x);
		
		//números com ponto flutuante ;
		//double y;
		//y = sc.nextDouble();
		//System.out.println("Você digitou " + y); //println sempre retorna casas decimais com .
		
		//double y;
		//y = sc.nextDouble();
		//System.out.printf("Você digitou %.2f%n", y); //printf sempre retorna o padrão de idioma da máquina para casas decimais.
		
		//char t;
		//t = sc.next().charAt(0); //charAt(n) n sempre será o número a posição de retorno da entrada, similar ao slice.
		//System.out.println("Você digitou: " + t);
		
		System.out.println("Digite um número e aperte 'ENTER', seguido de três frases com 'ENTER' após cada uma: ");
		//Para ler vários dados na mesma linha
//		String x;
//		int y;
//		double z;
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println("Dados digitados: ");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		//Inserir dados com quebra de linha
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();		
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.printf("%s %s %s => texto inserido, %d => número inserido", s1, s2, s3, x);
		sc.close();
	}
}
