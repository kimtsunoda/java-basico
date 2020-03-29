package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que calcule o mostre a m�dia aritm�tica de N notas. 
 */ 

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double nota;
		int qtdeNota;
		double somaNota = 0;
		
		System.out.println("Digite a quantidade de notas que deseja inserir: ");
		qtdeNota = scan.nextInt();
		
		for (int i=1; i<=qtdeNota; i++) {
			System.out.println("Digite a nota: ");
			nota = scan.nextDouble();
			somaNota += nota;
		}
		
		double media = somaNota/qtdeNota;
		
		System.out.println("A media �: " + media);

	}
			
}
