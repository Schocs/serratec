package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraLista {
	/*1) Perguntar e ler o nome e o sobrenome(ops separadas), concatenar as variáveis e formar uma frase
	 * */
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Olá, qual é seu nome?");
		String nome = myObj.nextLine();
		System.out.println("E qual seu sobrenome?");
		String sobrenome = myObj.nextLine();
		System.out.println("Olá, " + nome + " " + sobrenome + "! Boas vindas à era das máquinas!!");
		myObj.close();
	}
}
