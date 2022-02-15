package br.com.java;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int valor1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = teclado.nextInt();
		System.out.println(valor1);
		System.out.println(valor2);
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		int divisao = valor1 / valor2;
		int resto = valor1 % valor2;
	}

}
