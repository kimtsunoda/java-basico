package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a 
 * seguinte fórmula: (72.7*altura) - 58
 */

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println("O peso ideal é " + peso);

	}

}
