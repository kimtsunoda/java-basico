package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faça um Programa que peça a temperatura em graus Celsius,transforme e mostre em graus Farenheit.
 */

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		 double celsius = scan.nextDouble();
		 
		 double farenheit = 1.8 * celsius + 32;
	
		 System.out.println("A temperatura em Farenheit é " + farenheit);

	}

}
