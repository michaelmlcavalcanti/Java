package br.com.java;

import java.util.Scanner;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int limite = teclado.nextInt();
		while(limite < 5) {
			System.out.println(limite);
			limite++;
		}
		System.out.println("Fim While");
		do {
			System.out.println(limite);
			limite++;
		} while(limite < 10);
		System.out.println("Fim do While");
		
		for(int i = 0; i < limite; i++) {
			System.out.println(i);
		}
	}

}
