package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraListaDois {

	public static void main(String[] args) {
		// programa para ler idade de 6 pessoas(5 em loop), e imprimir a soma.
		int idade = 0, soma = 0;
		Scanner meuScanner = new Scanner(System.in)
		for (int i = 0; i < 6; i++) {
			System.out.println("Qual a idade do aluno " + (i + 1) + "?");
			idade = meuScanner.nextInt();
			soma += idade;
		}
		System.out.println("Agora, qual sua idade?");
		idade = meuScanner.nextInt();
		soma += idade;
		System.out.println("O tempo de vida meu e de meus colegas é de: " + soma);
		meuScanner.close();
	}

}
