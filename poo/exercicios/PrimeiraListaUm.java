package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraListaUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, sobrenome;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Olá! Qual o seu primeiro nome? ");
		nome = leitor.nextLine();
		System.out.println(nome + ", qual o seu sobrenome? ");
		sobrenome = leitor.nextLine();
		System.out.println(
				nome + " " + sobrenome + ", um grande prazer! Boas vindas à era das máquinas, serei seu guia!");
		leitor.close();
	}

}
