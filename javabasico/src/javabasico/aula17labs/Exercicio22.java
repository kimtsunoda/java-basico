package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar 
 * a quantidade de CDs e o valorpara em cada um.
 */ 

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double valor;
		int qtdeCd;
		int soma = 0;
		
		
		System.out.println("Digite a quantidade de CD: ");
		qtdeCd = scan.nextInt();
		
		for (int i=1; i <= qtdeCd; i++) {
			
			System.out.println("Digite o valor do CD " + i);
			valor = scan.nextDouble();
				
			soma += valor;
		}
		
		double media = soma / qtdeCd;
		
		System.out.println("O valor total investido: " + soma);
		System.out.println("Quantidade de CD " + qtdeCd);
		System.out.println("Valor medio por CD " + media);
		
	}
}