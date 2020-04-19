package javabasico.aula27labs;

public class JogoVelha {
	char [][] jogoVelha = new char [3][3];
	int jogada = 1;
	
	
	boolean vezJogador() {
		if (jogada % 2 != 0) {
			return true;
		} 
		return false;
	}
	
	
	boolean validarJogada (int linha , int coluna, char sinal) {
		if (jogoVelha [linha][coluna] == 'X' || jogoVelha [linha][coluna] == 'O') {
			System.out.println("Posicao invalida!!!");
			return false;
			
		} else {
			jogoVelha [linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro () {
		for (int i=0; i < jogoVelha.length ; i++) {
			for (int j=0; j < jogoVelha[i].length ; j++) {
				System.out.print (jogoVelha [i][j] + " | ");
			}
			System.out.println ("");
		}
	}
	
	boolean verificarGanhador(char sinal){
		if ((jogoVelha [0][0] == sinal && jogoVelha [0][1] == sinal && jogoVelha [0][2] == sinal) ||
				(jogoVelha [1][0] == sinal && jogoVelha [1][1] == sinal && jogoVelha [1][2] == sinal) ||
				(jogoVelha [2][0] == sinal && jogoVelha [2][1] == sinal && jogoVelha [2][2] == sinal) ||
				(jogoVelha [0][0] == sinal && jogoVelha [1][0] == sinal && jogoVelha [2][0] == sinal) ||
				(jogoVelha [0][1] == sinal && jogoVelha [1][1] == sinal && jogoVelha [2][1] == sinal) ||
				(jogoVelha [0][2] == sinal && jogoVelha [1][2] == sinal && jogoVelha [2][2] == sinal) ||
				(jogoVelha [0][0] == sinal && jogoVelha [1][1] == sinal && jogoVelha [2][2] == sinal) ||
				(jogoVelha [0][2] == sinal && jogoVelha [1][1] == sinal && jogoVelha [2][0] == sinal)) {
				return true;
			}
			return false;
		}
	
}