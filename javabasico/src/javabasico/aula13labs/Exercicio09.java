package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Fa�a um Programa que pe�a a temperatura em graus Farenheit,transforme e mostre a temperatura em graus Celsius.
 */

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
				
		double celsius = (5 * (farenheit -32) / 9);
		
		System.out.println ("A temperatura em Celsius � " + celsius);

	}

}
