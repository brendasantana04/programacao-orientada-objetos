package exercicio1;
// exercicio 1

//importando scanner para entrada de informações
import java.util.Scanner;

public class Soma {
	public static void main (String[] args) {
		Somatorio();
	}
	
	public static double somatorio () {
		Scanner sc = new Scanner(System.in); //importando o scanner para leitura
		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		System.out.print(valorA + valorB);
	}
}

