package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraListaTres {

	public static void main(String[] args) {
		// criar mini calculadora de dois números, e que mostra todas as 4 operações basicas possiveis. Tratar erros possíveis(divisão por zero etc); 
		int resultD=0, num1=0, num2=0, resultS=0, resultN=0, resultM=0, restoD=0;
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Qual o primeiro número da super mini calculadora de 2 números?");
		num1 = meuScanner.nextInt();
		System.out.println("O primeiro número é " + num1 +". Qual o segundo número?");
		num2 = meuScanner.nextInt();
		if(num2==0) {
			System.out.println("É impossível dividir por O! Digite outro número: ");
			num2 = meuScanner.nextInt();
		}
		if(num2<0) {
			System.out.println("Este número é negativo, portanto as operações de soma e subtração ficarão 'trocadas'!");
		}
		System.out.println("Calculando... Resultados:");
		resultS = num1 + num2;
		resultN = num1 - num2;
		resultM = num1*num2;
		resultD = num1/num2;
		restoD=num1%num2;
		System.out.println("Primeiro número: " + num1 + ". Segundo número: " + num2+";");
		System.out.println("Soma: " + resultS);
		System.out.println("Subtração: " + resultN);
		System.out.println("Divisão: " + resultD + " e resto: " + restoD);
		System.out.println("Multiplicação: " + resultM);
		meuScanner.close();
	}
}
