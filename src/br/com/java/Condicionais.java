package br.com.java;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		
		if (opcao == 1) {
			System.out.println("Voc� escolheu a op��o 1");
		}else if(opcao == 2){
			System.out.println("Voce escolheu a op��o 2");
		}else {
			System.out.println("Voc� escolheu nenhuma op��o");
		}
		
		switch(opcao) {
		case 1:
			System.out.println("Voc� escolheu a op��o 1");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o 2");
			break;
		default:
			System.out.println("Voc� escolheu nenhuma op�ao");
		}
	}

}
