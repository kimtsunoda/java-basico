package javabasico.aula36labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva uma classe para representar um Curso, que tem nome e horário.Cada curso tem um Professor, que possui nome, departamento e
 * email. Cada Curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas. Escreva um programa teste que crie
 * um Curso com 5 alunos, e que preça para o usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo
 * está aprovado (media maior ou igual a 7),e qual é a média da turma.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Curso:");
		String nomeCurso = scan.nextLine();
		
		System.out.println("Digite o horario do Curso:");
		String horarioCurso = scan.nextLine();
		
		System.out.println("Digite o nome do Professor:");
		String nomeProfessor = scan.nextLine();
		
		System.out.println("Digite o departamento do Professor:");
		String depProfessor = scan.nextLine();
		
		System.out.println("Digite o email do Professor:");
		String emailProfessor = scan.nextLine();
		
		Curso curso = new Curso ();
		curso.setNome(nomeCurso);
		curso.setHorario(horarioCurso);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(depProfessor);
		professor.setEmail(emailProfessor);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i=0; i < 5 ; i++) {
			
			System.out.println("Digite o nome do Aluno " + (i+1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Digite a matricula do Aluno:");
			String matriculaAluno = scan.nextLine();
			
			double [] notas = new double [4];
			
			for (int j=0; j < 4; j++) {
				System.out.println("Digite a nota:" + (j+1));
				notas [j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno ();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
			
			curso.setAlunos(alunos);
			
			System.out.println(curso.mostrarInfo());
	}

}
