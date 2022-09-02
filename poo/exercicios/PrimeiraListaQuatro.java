package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class PrimeiraListaQuatro {

	public static void main(String[] args) {
		// conversor de temp Celsius Fahrenheit(f=c*1.8+32);
		float c, f;
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Digite a temperatura em celsius que deseja converter: ");
		c = meuScanner.nextfloat()
		f = (c * 1.8) + 32;
		System.out.println("A temperatura de " + c + "ºC equivale a " + f + "ºF.");
		meuscanner.close();
	}
}
