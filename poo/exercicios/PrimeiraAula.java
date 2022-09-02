package br.com.residencia.poo.exercicios;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrimeiraAula {
	static double num2D;
	static double num2D2;
	static double num2D3;
	/*
	 * Entender a questão de como usar variáveis locais em classe. Ao usar static,
	 * acredito que bloqueio a capacidade dessas variáveis de assumir outros
	 * valores. Tem a questão do try catch, q imagino que funcione tipo getter e
	 * setter, mas não sei ao certo. É para pesquisar; Acho que resolvendo essa
	 * questão, que pode ser complexa, a calculadora funcionaria. Outra questão, no
	 * entanto, é saber se o return dos métodos checaZero e checaNeg funciona ou
	 * não;
	 */

	public static double checaZero() {
		String num;
		double num2d = 0.0;
		Scanner receber1 = new Scanner(System.in);
		if (num2D == 0) {
			System.out.println("O número digitado é ZERO. Impossível realizar divisão. Digite outro número válido: ");
			num = receber1.nextLine();
			num2d = Double.parseDouble(num);
			System.out.println(num2d + " " + num2D + " " + num2D2 + " " + num2D3);
			receber1.close();
		}
		return num2d;
	}

	public static double checaNeg() {
		String num;
		double numAux = 0.0;
		int caso;
		Scanner receber1 = new Scanner(System.in);
		if (num2D2 < 0) {
			System.out.println(
					"O número digitado é MENOR DO QUE ZERO! As operações soma e subtração ficarão trocadas. Deseja prosseguir? 1 para sim, 2 para não");
			caso = receber1.nextInt();
			if (caso == 1) {
				System.out.println("Prosseguindo...");
				numAux = num2D2;
			} else if (caso == 2) {
				System.out.println("Digite um novo número: ");
				num = receber1.nextLine();
				double num2d = Double.parseDouble(num);
				numAux = num2d;
			} else {
				System.out.println("Número inválido. Prosseguindo operação...");
				checaNeg();
				numAux = num2D2;
			}
		}
		receber1.close();
		return numAux;
	}

	public static BigDecimal transforme(double num2D3) {
		BigDecimal num = BigDecimal.valueOf(num2D3);
		return num;
	}

	public static void main(String[] args) throws NumberFormatException {
		// criar mini calculadora de dois números, e que mostra todas as 4 operações
		// basicas possiveis. Tratar erros possíveis(divisão por zero etc);
		Scanner receber = new Scanner(System.in);
		// double resultM=0.0, resultS=0.0, resultN=0.0, resultD=0.0;
		String num1, num2;
		double num2Dd = 0.0;
		System.out.println("Esta é a super mini calculadora de dois números. Digite o primeiro número: ");
		num1 = receber.nextLine();
		BigDecimal num1BD = new BigDecimal(num1);
		System.out.println("O primeiro número é " + num1BD + "! Digite o segundo é: ");
		num2 = receber.nextLine();
		BigDecimal num2BD = new BigDecimal(num2);
		num2Dd = Double.parseDouble(num2);
		num2D = num2Dd;
		num2Dd = checaZero();
		num2D2 = num2Dd;
		num2Dd = checaNeg();
		num2D3 = num2Dd;
		num2BD = transforme(num2D3);
		BigDecimal resultS = num1BD.add(num2BD);
		resultS = resultS.setScale(3, RoundingMode.UP);
		BigDecimal resultN = num1BD.subtract(num2BD);
		resultN = resultN.setScale(3, RoundingMode.UP);
		BigDecimal resultM = num1BD.multiply(num2BD);
		resultM = resultM.setScale(3, RoundingMode.UP);
		BigDecimal resultD = num1BD.divide(num2BD);
		resultD = resultD.setScale(3, RoundingMode.UP);
		System.out.println("Primeiro número: " + num1BD + ". Segundo número: " + num2BD + ";");
		System.out.println("Soma: " + resultS + ";");
		System.out.println("Subtração: " + resultN + ";");
		System.out.println("Divisão: " + resultD + ";");
		System.out.println("Multiplicação: " + resultM + ".");
		receber.close();

	}
}
