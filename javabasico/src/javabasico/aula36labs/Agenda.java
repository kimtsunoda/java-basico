package javabasico.aula36labs;

public class Agenda {
	private String nome;
	private Contato [] contatos;

	public Agenda() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato [] getContatos() {
		return contatos;
	}

	public void setContatos(Contato [] contatos) {
		this.contatos = contatos;
	}
	
	public String obterInfo() {
		String info = "Agenda" + "\n";
		
		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";	
			}
			 
		}
		return info;
	}
}
