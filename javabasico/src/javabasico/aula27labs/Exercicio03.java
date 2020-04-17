package javabasico.aula27labs;

import java.util.Scanner;

public class Exercicio03 {
		public static void main (String []args ) {
			Scanner scan = new Scanner (System.in);
			
			Aluno aluno = new Aluno ();
			
			System.out.println("Digite o nome do aluno: ");
			aluno.nome = scan.next();
			
			System.out.println("Digite a matricula do aluno: ");
			aluno.matricula = scan.nextInt();
			
			System.out.println("Digite o nome do curso: ");
			aluno.nomeCurso = scan.next();
			
			for (int i=0; i < aluno.nomeDisciplinas.length; i++) {
				System.out.println("Digite o nome da disciplina " + (i+1));
				aluno.nomeDisciplinas[i] = scan.next();
			}
			
			for (int i=0; i < aluno.notasDisciplinas.length; i++) {
				System.out.println("Notas da disciplina: " + aluno.nomeDisciplinas[i]);
				for (int j=0; j < aluno.notasDisciplinas[i].length; j++ ) {
					System.out.println("Nota" + (j+1));
					aluno.notasDisciplinas[i][j] = scan.nextDouble();
				}
				
			}
			
			aluno.mostrarInfomacoes();
		}
}
