package javabasico.aula17labs;

/**
 * @author Kim Tsunoda
 * Objetivo Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000 habitantes com uma taxa 
 * de crescimento	de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as
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
