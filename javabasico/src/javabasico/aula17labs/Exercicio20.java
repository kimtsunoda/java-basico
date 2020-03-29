package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera verificar se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o,
 *  dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada 
 */ 

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double idade;
		int qtdePessoa;
		double somaIdade = 0;
		
		System.out.println("Digite a quantidade de pessoas que deseja inserir: ");
		qtdePessoa = scan.nextInt();
		
		for (int i=1; i<=qtdePessoa; i++) {
			System.out.println("Digite a Idade: ");
			idade = scan.nextInt();
			somaIdade += idade;
		}
		
		double media = somaIdade/qtdePessoa;
		
		System.out.println("A media �: " + media);

		if (media >= 0 &&  media <=25) {
			System.out.println("Turma � jovem");
		} else if (media > 25 &&  media <=60) {
			System.out.println("Turma � adulta");
		} else if (media > 60 ) {
			System.out.println("Turma � idosa");
	}
			
}
}