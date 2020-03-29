package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
 *  dizer se a turma é jovem, adulta ou idosa, conforme a média calculada 
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
		
		System.out.println("A media é: " + media);

		if (media >= 0 &&  media <=25) {
			System.out.println("Turma é jovem");
		} else if (media > 25 &&  media <=60) {
			System.out.println("Turma é adulta");
		} else if (media > 60 ) {
			System.out.println("Turma é idosa");
	}
			
}
}