package javabasico.aula33labs;

public class Aluno {
	private String nome;
	private int matricula;
	private String nomeCurso;
	private double soma;
	private double media;
	
	private String [] nomeDisciplinas;
	private Double [][] notasDisciplinas;
	
	public Aluno() {
		nomeDisciplinas = new String [3];
		notasDisciplinas = new Double [3][4];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public Double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(Double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public void setNomeDisciplinas (int pos, String nomeDisciplinas) {
		this.nomeDisciplinas[pos] = nomeDisciplinas;
	}
	
	public void setNotasDisciplinas (int posI, int posJ, double notasDisciplinas) {
		this.notasDisciplinas[posI] [posJ] = notasDisciplinas;
	}
	
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
