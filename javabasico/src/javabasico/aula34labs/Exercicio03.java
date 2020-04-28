package javabasico.aula34labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	um método para calcular factorial de um	número na classe Calculadora do	exercício anterior.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		do {
			System.out.println("Digite um numero positivo: ");
			num = scan.nextInt();
			
			if (num < 0) {
				System.out.println("Numero Invalido!!!");
			}
		} while (num < 0);
		
		Calculadora.imprimirTotal(num, Calculadora.fatorial(num));
	}

}
