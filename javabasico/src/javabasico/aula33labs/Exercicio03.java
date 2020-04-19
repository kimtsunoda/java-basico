package javabasico.aula33labs;

import java.util.Scanner;

public class Exercicio03 {
		public static void main (String []args) {
			Scanner scan = new Scanner (System.in);
			
			Aluno aluno = new Aluno ();
			
			System.out.println("Digite o nome do aluno: ");
			aluno.setNome(scan.next());
			
			System.out.println("Digite a matricula do aluno: ");
			aluno.setMatricula(scan.nextInt());
			
			System.out.println("Digite o nome do curso: ");
			aluno.setNomeCurso (scan.next());
			
			for (int i=0; i < aluno.getNomeDisciplinas().length; i++) {
				System.out.println("Digite o nome da disciplina " + (i+1));
				aluno.setNomeDisciplinas(i, scan.next());
			}
			
			for (int i=0; i < aluno.getNotasDisciplinas().length; i++) {
				System.out.println("Notas da disciplina: " + aluno.getNomeDisciplinas()[i]);
				for (int j=0; j < aluno.getNotasDisciplinas()[i].length; j++ ) {
					System.out.println("Nota" + (j+1));
					aluno.setNotasDisciplinas(i, j, scan.nextDouble());
				}
				
			}
			
			aluno.mostrarInfomacoes();
		}
}
