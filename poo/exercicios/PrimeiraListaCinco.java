package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraListaCinco {

	public static void main(String[] args) {
		int resultA, resultB;
		Scanner meuScanner = new Scanner(System.in);
		resultA = 2 + 3 + (-5*8) - 4 + 354 - 521 + (7*66);
		resultB = 2 + (7*(14-21)) + (28*3*42) + 740 - ((156 + 4 + 40)*9);
		System.out.println("A expressão A tem resultado: " + resultA);
		System.out.println("A expressão B tem resultado: " + resultB);
		meuScanner.close();
	}

}
