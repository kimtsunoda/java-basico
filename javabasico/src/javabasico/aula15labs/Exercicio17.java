package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em seguida informe se este ano � ou n�o bissexto
 */

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite o ano");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
			
			System.out.println ("O ano " + ano + " � bissexto");
			
		} else {
			
			System.out.println ("O ano " + ano + " n�o � bissexto");
		}
			
		}
			
}	
