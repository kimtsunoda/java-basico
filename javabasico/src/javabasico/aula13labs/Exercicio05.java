package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faca um Programa que converta metros para centímetros.
 */

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em metros: ");
		double metro = scan.nextDouble();
		
		double centimetro = (int) (metro*100);
		
		System.out.println("A quantidade em centimetro é " + centimetro);

	}

}
