
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 */

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite a quantidade de morango: ");
		double morangoKg = scan.nextDouble();
		System.out.println ("Digite a quantidade de maca: ");
		double macaKg = scan.nextDouble();
		
		double precoMorango = 0;
		if (morangoKg <= 5) {
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if (macaKg <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}
		
		double totalMorango = morangoKg * precoMorango;
		double totalMaca = macaKg * precoMaca;
		double valorTotal = totalMorango + totalMaca;
		double desconto = 0;
		double valorNovo = 0;
		
		if (valorTotal > 25 || morangoKg + macaKg > 8) {
			System.out.println("Valor total: " + valorTotal);
			desconto = valorTotal * 0.10;
			System.out.println("Desconto: " + desconto);
			valorNovo = valorTotal - desconto;
			System.out.println("Valor com Desconto: " + valorNovo);
		} else {
			System.out.println("Valor total: " + valorTotal);
			System.out.println("Desconto: " + desconto);
			valorNovo = valorTotal - desconto;
			System.out.println("Valor com Desconto: " + valorNovo);
		}
		
	}
}