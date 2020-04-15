package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
escaleno.
 */

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite o primeiro lado:");
		double lado1 = scan.nextDouble();
		System.out.println ("Digite o segundo lado:");
		double lado2 = scan.nextDouble();
		System.out.println ("Digite o terceiro lado:");
		double lado3 = scan.nextDouble();
		
		if (lado1 == lado2 && lado1 == lado3) {
			
			System.out.println ("O triangulo � Equilatero");
			
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			
			System.out.println ("O triangulo � Isoceles");
					
		} else
		
			System.out.println ("O triangulo � Escaleno");
		
	}
	
}
