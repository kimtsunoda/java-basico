
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
 */

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o preco do pruduto 1: ");
		double produto1 = scan.nextDouble();
		System.out.println("Digite o preco do pruduto 2: ");
		double produto2 = scan.nextDouble();
		System.out.println("Digite o preco do pruduto 3: ");
		double produto3 = scan.nextDouble();
		
		
		
		if (produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("Comprar o produto 1: " + produto1);
		} else if (produto2 <= produto3) {
			System.out.println("Comprar o produto 2: " + produto2);
		} else {
			System.out.println("Comprar o produto 3: " + produto3);
		}
	}

}
