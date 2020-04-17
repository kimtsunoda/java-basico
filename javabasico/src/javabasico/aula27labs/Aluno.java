package javabasico.aula27labs;

public class Aluno {
	String nome;
	int matricula;
	String nomeCurso;
	double soma;
	double media;
	
	String [] nomeDisciplinas = new String [3];
	Double [][] notasDisciplinas = new Double [3][4];
	
	void mostrarInfomacoes () {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: : " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for (int i=0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j=0; j < notasDisciplinas[i].length; j++ ) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println("");
			if (verificarMedia(i)) {
				System.out.println ("Aprovado");
			}else {
				System.out.println ("Reprovado");
			}
			
		}
			
	}
	
	boolean verificarMedia (int i) {
		soma = 0;
		
		for (int j=0; j< notasDisciplinas[i].length; j++) {
		soma += notasDisciplinas [i][j];
		}
		
		media = soma /4;
		
		if (media >=7) {
			return true;
		}
		
		return false;
		
	}
}
	
