package br.com.java;

import java.util.Scanner;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		valor++;
		System.out.println(valor);
		valor--;
		System.out.println(valor);
		++valor;
		System.out.println(valor);
		--valor;
		System.out.println(valor);
		valor += 10;
		System.out.println(valor);
		valor -= 3;
		System.out.println(valor);
		valor *= 4;
		System.out.println(valor);
		valor /= 2;
		System.out.println(valor);
		valor %= 1;
		System.out.println(valor);
	}

}
