package javabasico.aula17labs;

/**
 * @author Kim Tsunoda
 * Objetivo O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,com cerca de 10 caixas. Para agilizar o c�lculo de quanto cada clientedeve pagar ele desenvolveu um 
 * tabela que cont�m o n�mero de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa apenas contar quantos itens o cliente est� levando 
 * e olhar na tabela de pre�os. Voc� foi contratado para desenvolver o programa que monta esta tabela de pre�os, que conter� os pre�os de 1 at� 50 produtos, conforme o exemplo abaixo:
 */ 

public class Exercicio23 {

	public static void main(String[] args) {
		
		double valor = 1.99;
		double total = 0;
		
		System.out.println ("Loja Quase Dois Tabela de Preco ");
		
	for (int i=1; i<=50; i++) {
		
		total = valor * i;
		
		System.out.println (i + " - R$ " + total);
	}
		
	}
}