package br.com.java;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valor1 = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = teclado.nextInt();
		int maior = valor1 > valor2 ? valor1 : valor2;
		System.out.println(maior);
		int menor = valor1 < valor2 ? valor1 : valor2;
		System.out.println(menor);
		boolean igual = valor1 == valor2 ? true: false;
		System.out.println(igual);
		boolean maiorIgual = valor1 >= valor2 ? true: false;
		System.out.println(maiorIgual);
		boolean menorIgual = valor1 <= valor2 ? true: false;
		System.out.println(menorIgual);
		boolean diferente = valor1 != valor2 ? true: false;
		System.out.println(diferente);
		boolean e = (valor1 > valor2 && valor1 > 5) ? true: false;
		System.out.println(e);
		boolean ou = (valor1 > valor2 || valor1 > 5) ? true: false;
		System.out.println(ou);
		boolean not = !(valor1 > valor2 || valor1 > 5) ? true: false;
		System.out.println(not);

	}

}
