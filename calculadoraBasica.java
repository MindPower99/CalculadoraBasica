package Calculadora;
import java.util.Scanner;

public class calculadoraBasica {
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		double n1, n2, sub, div, soma, multi = 0;
		int operacao = -1,continuar;
		boolean reiniciar = true;
		
		while (reiniciar == true) 
		{
		
			System.out.println("=======Calculadora======");
			System.out.print("Digite um n�mero ai cumpade: ");
			n1 = input.nextDouble();
			System.out.print("Digite outro n�mero blz");
			n2 = input.nextDouble();
		
			System.out.println("Escolha uma opera��o: ");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Divis�o");
			System.out.println("4 - Multiplica��o");
			
			while (operacao < 1 || operacao > 4)
			{
		
				System.out.print("Digite o n�mero da opera��o desejada: ");
				operacao = input.nextInt();
			
					if (operacao == 1) {
						soma = n1 + n2;
						System.out.println("A soma desses n�meros corresponde a: " +soma);
					}
					if (operacao == 2) {
						sub = n1 - n2;
						System.out.println("A subtracao desses n�meros corresponde a: " +sub);
					}
					if (operacao == 3) {
						div = n1 / n2;
						System.out.println("A divis�o desses n�meros corresponde a: " +div);
					}
					if (operacao == 4) {
						multi = n1 * n2;
						System.out.println("A multiplica��o desses n�meros corresponde a: " +multi);
					}
					if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
						System.out.println("op��o inv�lida rapaz");
					}
			
					System.out.println("Deseja fazer outro c�lculo ?");
					System.out.println("1 - Continuar");
					System.out.println("2 - Sair");
					continuar = input.nextInt();
			
					if (continuar == 1) {
						operacao = -1;
						System.out.println("Fazendo outro c�lculo: ");
						break;
					}
					else {
						reiniciar = false;
						System.out.println("Voc� saiu!");
					}
					
			}
			
		}
		
	}
}
