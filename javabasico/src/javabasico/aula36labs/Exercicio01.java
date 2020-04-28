package javabasico.aula36labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma	classe Agenda,que contém vários	contatos do	tipo Contato. Cada contato possui nome,	telefone e email. A	Agenda também4
 * possui um nome.Crie um programa teste que peça para o usuário entrar	com	o nome da Agenda e em seguida 3	contatos. Crie métodos que retornem 
 * uma String com a	informação de cada contato e também	de todos os contatos da	agenda.
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
