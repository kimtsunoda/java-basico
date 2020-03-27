
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes
   situações:
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
			
			System.out.println("Nao é uma equacao e 2 grau");
			
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
			
		