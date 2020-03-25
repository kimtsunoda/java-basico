package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do aquivo para download (em MB): ");
		double arquivo = scan.nextDouble();
		System.out.println("Digite a velocidade da internet (em MBps): ");
		double internet = scan.nextDouble();
		
		double tempo = (arquivo/internet);
		
		System.out.println("O tempo de download é de aproximadamente (minutos): " + tempo);

	}

}
