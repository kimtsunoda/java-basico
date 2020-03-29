package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para isto, pe�a a quantidade de turmas e a quantidade de alunos para cada turma. As 
 * turmas n�o podem ter mais de 40 alunos.
 */ 

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int qtdeAluno;
		int qtdeTurma;
		int somaAluno = 0;
		
		boolean validar = false;
		
		System.out.println("Digite a quantidade de turma: ");
		qtdeTurma = scan.nextInt();
		
		for (int i=1; i <= qtdeTurma; i++) {
			
			do {
				System.out.println("Digite a quantidade de Aluno: ");
				qtdeAluno = scan.nextInt();
				
				if (qtdeAluno >=0 && qtdeAluno <=40) {
					validar = true;
				} else {
					System.out.println("Digite a quantidade de Aluno entre 0 e 40 ");
				}
				
			} while (!validar);
			
			somaAluno += qtdeAluno;
			validar = false;
		}
		
		double media = somaAluno / qtdeTurma;
		
		System.out.println("A media de aluno por turma � " + media);
		
		
}
}