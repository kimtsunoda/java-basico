
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c. O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes
   situa��es:
 */

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite a:");
		int a = scan.nextInt();
		
		int b;
		int c;
		double delta;
		double x1;
		double x2;
		
		
		if (a == 0) {
			
			System.out.println("Nao � uma equacao e 2 grau");
			
		} else {
			
			System.out.println ("Digite b:");
			b = scan.nextInt();
			
			System.out.println ("Digite c:");
			c = scan.nextInt();
			
			delta = Math.pow(b, 2) - (4 * a * c);

			if (delta < 0 ) {
				System.out.println("Delta negativo");
			} else {
				
				x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("Delta = " + delta);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
		}
		
		
	}
}		
			
		