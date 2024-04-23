import java.util.Scanner;

public class Estruturas_Condicionais {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int y; Nenhuma variável JAVA pode ser usada antes ser inicializada, ou seja, atribuir um valor inicial
	
		System.out.println("Que horas são, meu Jovem?");
		int hora = sc.nextInt();
		
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora > 12 && hora < 18) {
				System.out.println("Boa tarde, filhos de Deus");
		}
		else {
			System.out.println("Boa noite, abençoados");
		}
		
		sc.close();
	}

}
