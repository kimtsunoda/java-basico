package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um programa que calcule 
 * a média aritmética simples das notas informadas armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. 
 * Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será “reprovado”.
 */

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println ("Digite a nota 1 do aluno " + i);
			vetorA[i] = scan.nextDouble();
			
			System.out.println ("Digite a nota 2 do aluno " + i);
			vetorB[i] = scan.nextDouble();
			
			vetorC[i] = (vetorA[i] + vetorB[i]) /2; 
		}
		
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		System.out.println("");
		System.out.print("Vetor B ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorB[i] + " ");
		}	
		
		System.out.println (" ");
		System.out.print("Vetor C ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorC[i] + " ");
			if (vetorC[i] >= 7) {
				System.out.print("Aprovado ");
			} else {
				System.out.print("Reprovado ");
			}
		}	
}
}