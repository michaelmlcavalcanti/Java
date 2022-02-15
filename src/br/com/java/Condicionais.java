package br.com.java;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		if (opcao == 1) {
			System.out.println("Você escolheu a opção 1");
		}else if(opcao == 2){
			System.out.println("Voce escolheu a opção 2");
		}else {
			System.out.println("Você escolheu nenhuma opção");
		}
		
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2");
			break;
		default:
			System.out.println("Você escolheu nenhuma opçao");
		}
	}

}
