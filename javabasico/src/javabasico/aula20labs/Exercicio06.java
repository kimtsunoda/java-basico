package javabasico.aula20labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, usando o 
 * computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve
 * impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, 
 * o programa deve atualizar a situação do tabuleiro  na tela.
 */

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		char [][] jogoVelha = new char [3][3];
		boolean fimJogo = false;
		int jogada = 1;
		char sinal;
		int linha;
		int coluna;
		boolean validarLinha;
		boolean validarColuna;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = 0");
		
		
		do {
			
			if (jogada % 2 != 0) {
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
			
			if (jogoVelha [linha][coluna] == 'X' || jogoVelha [linha][coluna] == 'O') {
				System.out.println("Posicao invalida!!!");
			} else {
				jogoVelha [linha][coluna] = sinal;
				jogada++;
			}
			
			for (int i=0; i < jogoVelha.length ; i++) {
				for (int j=0; j < jogoVelha[i].length ; j++) {
					System.out.print (jogoVelha [i][j] + " | ");
				}
				System.out.println ("");
			}
			
			if ((jogoVelha [0][0] == 'X' && jogoVelha [0][1] == 'X' && jogoVelha [0][2] == 'X') ||
				(jogoVelha [1][0] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [1][2] == 'X') ||
				(jogoVelha [2][0] == 'X' && jogoVelha [2][1] == 'X' && jogoVelha [2][2] == 'X') ||
				(jogoVelha [0][0] == 'X' && jogoVelha [1][0] == 'X' && jogoVelha [2][0] == 'X') ||
				(jogoVelha [0][1] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [2][1] == 'X') ||
				(jogoVelha [0][2] == 'X' && jogoVelha [1][2] == 'X' && jogoVelha [2][2] == 'X') ||
				(jogoVelha [0][0] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [2][2] == 'X') ||
				(jogoVelha [0][2] == 'X' && jogoVelha [1][1] == 'X' && jogoVelha [2][0] == 'X')) {
				fimJogo = true;
				System.out.println("Jogar 1 ganhou!!");				
			} else if ((jogoVelha [0][0] == 'O' && jogoVelha [0][1] == 'O' && jogoVelha [0][2] == 'O') ||
					(jogoVelha [1][0] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [1][2] == 'O') ||
					(jogoVelha [2][0] == 'O' && jogoVelha [2][1] == 'O' && jogoVelha [2][2] == 'O') ||
					(jogoVelha [0][0] == 'O' && jogoVelha [1][0] == 'O' && jogoVelha [2][0] == 'O') ||
					(jogoVelha [0][1] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [2][1] == 'O') ||
					(jogoVelha [0][2] == 'O' && jogoVelha [1][2] == 'O' && jogoVelha [2][2] == 'O') ||
					(jogoVelha [0][0] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [2][2] == 'O') ||
					(jogoVelha [0][2] == 'O' && jogoVelha [1][1] == 'O' && jogoVelha [2][0] == 'O')) {
				fimJogo = true;
				System.out.println("Jogar 2 ganhou!!");
			} else if (jogada > 9) {
				fimJogo = true;
				System.out.println("Ninguem ganhou!!");
			}
			
		} while (!fimJogo);
		
	}
	
}
	