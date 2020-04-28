package javabasico.aula33labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Desenvolva uma classe para representar o Jogo da Velha.Desenvolva uma classe para testar o Jogo. Criando	todos os atributos
 * do tipo privado, m�todos	getters e setters e construtores. Os m�todos que ser�o utilizados pela classe de teste devem ser p�blicos.	
 * Se necess�rio, crie m�todos privados	como auxiliares	para organizar melhor o	c�digo	fonte	tamb�m.
 */

public class Exercicio04 {
		public static void main (String []args) {
			Scanner scan = new Scanner (System.in);
			
			JogoVelha jogoVelha = new JogoVelha();
			
			boolean fimJogo = false;
			char sinal;
			int linha;
			int coluna;
			boolean validarLinha;
			boolean validarColuna;
			
			System.out.println("Jogador 1 = X");
			System.out.println("Jogador 2 = 0");
			
			do {
				
				if (jogoVelha.vezJogador()) {
					System.out.println("Vez do Jogador 1 ");
					sinal = 'X';
				} else {
					System.out.println("Vez do Jogador 2 ");
					sinal = 'O';
				}
				
				validarLinha = false;
				
				do {
				System.out.println ("Entre com a linha 1-3");
				linha = scan.nextInt();
				
				if(linha >= 1 && linha <=3) {
					validarLinha = true;
				} else {
					System.out.println("Digite uma linha valida!!!");
				}
					
				} while (!validarLinha);
				
				validarColuna = false;
				
				do {
				System.out.println ("Entre com a coluna 1-3");
				coluna = scan.nextInt();
				
				if(coluna >= 1 && coluna <=3) {
					validarColuna = true;
				} else {
					System.out.println("Digite uma coluna valida!!!");
				}
					
				} while (!validarColuna);
				
				linha--;
				coluna--;
				
				jogoVelha.validarJogada(linha, coluna, sinal);
				
				jogoVelha.imprimirTabuleiro();
				
				
				if (jogoVelha.verificarGanhador('X')) {
					fimJogo = true;
					System.out.println("Jogar 1 ganhou!!");				
				} else if (jogoVelha.verificarGanhador('O')) {
					fimJogo = true;
					System.out.println("Jogar 2 ganhou!!");
				} else if (jogoVelha.getJogada() > 9) {
					fimJogo = true;
					System.out.println("Ninguem ganhou!!");
				}
				
			} while (!fimJogo);
		}
}
