package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faca um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
 */

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado: ");
		int lado = scan.nextInt();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado � " + area + " e o dobro � " + area * 2);

	}

}
