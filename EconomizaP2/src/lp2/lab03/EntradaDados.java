package lp2.lab03;

import java.util.Scanner;

public class EntradaDados {
	public static Scanner input = new Scanner(System.in);

	public static int leInteiro(String mensagem) {
		System.out.print(mensagem);
		int numero = input.nextInt();
		input.nextLine();
		return numero;
	}

	public static String leString(String mensagem) {
		System.out.print(mensagem);
		String frase = input.nextLine();
		return frase;
	}

	public static double leDouble(String mensagem) {
		System.out.print(mensagem);
		double numero = input.nextDouble();
		input.nextLine();
		return numero;
	}
}