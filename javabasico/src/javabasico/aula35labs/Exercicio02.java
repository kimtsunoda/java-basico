package javabasico.aula35labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva um m�todo recursivo e est�tico que receba um n�mero	inteiro	positivo N e calcule o somat�rio dos n�meros de 1 a N.
 */


public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		do {
			System.out.println ("Digite um numero positivo: ");
			num = scan.nextInt();
			
			if (num < 0) {
				System.out.println ("Numero Invalido!!!");
			}
			
		} while (num < 0);
		
		System.out.println ("O somatorio de 1 a " + num + " � " + SomarRecursivo.somar(num));
	}

}
