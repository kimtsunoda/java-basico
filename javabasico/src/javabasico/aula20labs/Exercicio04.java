package javabasico.aula20labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 
 * 24 horas, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado). O programa deve ter um menu 
 * onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida com o compromisso, ou então, o usuário pode também 
 * consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
 */

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String [][] compromissos = new String [31][24];
		boolean sair = false;
		int opcao;
		int dia=0;
		int hora=0;
		boolean diaValido;
		boolean horaValida;
		
		while (!sair){
			System.out.println("Digite 1 para adicionar compromisso;");
			System.out.println("Digite 2 para consultar agenda;");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextInt();
			
			if (opcao ==1) {
				
				diaValido = false;
				
				while (!diaValido) {
					System.out.println("Digite o dia:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido= true;
					} else {
						System.out.println("Digite um dia valido!!!");
					}
				}
				
				horaValida = false;
				
				while(!horaValida) {
					System.out.println("Digite a hora:");
					hora = scan.nextInt();
					if (hora >= 0 && hora <=23) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora valida!!!");
					}
				}
				
				dia--;
				System.out.println("Digite o compromisso");
				compromissos [dia][hora] = scan.next();
				
			} else if (opcao ==2) {
				
				diaValido = false;
				
				while (!diaValido) {
					System.out.println("Digite o dia:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido= true;
					} else {
						System.out.println("Digite um dia valido!!!");
					}
				}
				
				horaValida = false;
				
				while(!horaValida) {
					System.out.println("Digite a hora:");
					hora = scan.nextInt();
					if (hora >= 0 && hora <=23) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora valida!!!");
					}
				}
				
				dia--;
				System.out.println("O Compromisso é " + compromissos[dia][hora]);
				
			} else if (opcao ==0) {
				sair = true;
			}else {
				System.out.println("Digite um valor valido !!!");
			}
			
		}
	}
}
	