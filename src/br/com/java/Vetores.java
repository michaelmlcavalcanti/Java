package br.com.java;

public class Vetores {

	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5,6,7};
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);		
			}
		
		for(int valor: vetor) {
			System.out.println(valor);
		}
	}

}
