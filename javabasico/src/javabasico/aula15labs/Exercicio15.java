package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
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
			
			System.out.println ("O triangulo é Equilatero");
			
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			
			System.out.println ("O triangulo é Isoceles");
					
		} else
		
			System.out.println ("O triangulo é Escaleno");
		
	}
	
}
