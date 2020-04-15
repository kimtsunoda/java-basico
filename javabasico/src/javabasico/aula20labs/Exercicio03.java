package javabasico.aula20labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares, a quantidade de números 
 * ímpares.
 */

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [][] valores = new int [3][3];
		int par =0;
		int impar=0;
		
		for (int i=0; i < valores.length ; i++ ) {
			for (int j=0; j < valores[i].length ; j++ ) {
				System.out.println("Digite um valor para a linha " + i + " coluna " + j);
				valores[i][j] = scan.nextInt();
				}
			}
		
		for (int i=0; i < valores.length ; i++ ) {
			for (int j=0; j < valores[i].length ; j++ ) {
					if (valores[i][j] % 2 ==0) {
						par ++;
					} else {
						impar ++;
					}
				}
			}
		
		for (int i=0; i < valores.length ; i++ ) {
			for (int j=0; j < valores[i].length ; j++ ) {
					System.out.print(valores[i][j] + " ");
				}
				System.out.println(" ");
			}
		System.out.println("Qtde de pares: " + par);
		System.out.println("Qtde de pares: " + impar);
	}
}
	