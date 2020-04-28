package javabasico.aula36labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma	classe Agenda,que cont�m v�rios	contatos do	tipo Contato. Cada contato possui nome,	telefone e email. A	Agenda tamb�m4
 * possui um nome.Crie um programa teste que pe�a para o usu�rio entrar	com	o nome da Agenda e em seguida 3	contatos. Crie m�todos que retornem 
 * uma String com a	informa��o de cada contato e tamb�m	de todos os contatos da	agenda.
 */

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nome;
		
		Agenda agenda = new Agenda ();
		
		Contato[] contatos = new Contato[3];
		for (int i=0; i<3; i++) {
			System.out.println ("Entre com as informacoes do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println ("Digite o nome:");
			nome = scan.nextLine();
			c.setNome(nome);
			System.out.println ("Digite o telefone: ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			System.out.println ("Digite o email: ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
	 
		if (agenda != null) {
			System.out.println (agenda.obterInfo());
		}
	}

}
