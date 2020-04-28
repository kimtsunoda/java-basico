package javabasico.aula33labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma	class para representar um Aluno. Adicione atributos relacionados �s	caracteristicas	de um Aluno, como nome,	matricula,
 * curso que est� matriculado,nome de 3 disciplinas	que	est� cursando e	as notas dessas 3 disciplinas. Desenvolva um m�todo	para verificar se
 * o aluno est� aprovado (nota maior ou	igual a	7) em uma determinada disciplina. Escreva um programa para testar essa classe,que pede as	
 * informa��es do aluno	ao usu�rio e ao	final informa o	nome das disciplinas, mostra as notas e	mostra se o	aluno foi aprovado	ou	n�o. 
 * Criando	todos os atributos do tipo privado, m�todos	getters e setters e construtores. Os m�todos que ser�o utilizados pela classe de teste 
 * devem ser p�blicos. Se necess�rio, crie m�todos privados	como auxiliares	para organizar melhor o	c�digo	fonte	tamb�m.
 */

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
