
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * objetivo Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante
 */

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {
			System.out.println("A letra " + letra + " � uma vogal");
		} else {
			System.out.println("A letra " + letra + " � uma consoante");
		}

	}

}