package javabasico.aula20labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).
 */

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String [][][] compromissos = new String [12][31][8];
		boolean sair = false;
		int opcao;
		int mes=0;
		int dia=0;
		int hora=0;
		boolean mesValido;
		boolean diaValido;
		boolean horaValida;
		
		while (!sair){
			System.out.println("Digite 1 para adicionar compromisso;");
			System.out.println("Digite 2 para consultar agenda;");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextInt();
			
			if (opcao ==1) {
				
				mesValido = false;
				
				while (!mesValido) {
					System.out.println("Digite o mes:");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido= true;
					} else {
						System.out.println("Digite um mes valido!!!");
					}
				}
				
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
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromissos [mes][dia][hora] = scan.next();
				
			} else if (opcao ==2) {
				
				mesValido = false;
				
				while (!mesValido) {
					System.out.println("Digite o mes:");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido= true;
					} else {
						System.out.println("Digite um mes valido!!!");
					}
				}
				
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
				
				mes--;
				dia--;
				System.out.println("O Compromisso é " + compromissos[mes][dia][hora]);
				
			} else if (opcao ==0) {
				sair = true;
			}else {
				System.out.println("Digite um valor valido !!!");
			}
			
		}
	}
}
	