package javabasico.aula27labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma	class para representar um Aluno. Adicione atributos relacionados às	caracteristicas	de um Aluno, como nome,	matricula,
 * curso que está matriculado,nome de 3 disciplinas	que	está cursando e	as notas dessas 3 disciplinas. Desenvolva um método	para verificar se
 * o aluno está aprovado (nota maior ou	igual a	7) em uma determinada disciplina. Escreva um programa para testar essa classe,que pede as	
 * informações do aluno	ao usuário e ao	final informa o	nome das disciplinas, mostra as notas e	mostra se o	aluno foi aprovado	ou	não.
 */

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
