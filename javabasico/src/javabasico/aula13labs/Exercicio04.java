package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
 */

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a nota 3: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a nota 4: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A m�dia � " + media);

	}

}
