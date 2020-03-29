package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a 
 * maior temperaturas informadas, bem como a média das temperaturas.
 */ 

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double temp;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double soma=0;
		int qtde;
		
		System.out.println("Quantas temperaturas deseja informar? ");
		qtde = scan.nextInt();
		
		for (int i=1; i <= qtde; i++) {
			System.out.println("Digite a temperatura: ");
			temp = scan.nextDouble();
			
			soma += temp;
			
			if(temp > max) {
				max = temp;
			}else if (temp < min) {
				min = temp;
			}
			
		}
		
		double media = soma / qtde;
		System.out.println("A maior temperatura é " + max);
		System.out.println("A menor temperatura é " + min);
		System.out.println("A temperatura media é " + media);
	}
		
	}
