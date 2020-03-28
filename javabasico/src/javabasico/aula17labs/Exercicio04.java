package javabasico.aula17labs;

/**
 * @author Kim Tsunoda
 * Objetivo Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa 
 * de crescimento	de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
 *  taxas de crescimento.
 */ 

public class Exercicio04 {

	public static void main(String[] args) {
		double populacaoA = 80000;
		double populacaoB = 200000;
		int qtdeAno = 0;
		
		while (populacaoA < populacaoB) {
			populacaoA +=  populacaoA * 0.03;
			populacaoB += populacaoB * 0.015;
			qtdeAno ++;
		}
		
		System.out.println("Populacao A: " + populacaoA);
		System.out.println("Populacao A: " + populacaoB);
		System.out.println("A quantidade de anos necessarios: " + qtdeAno);

	} 
	
}
