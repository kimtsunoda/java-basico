package javabasico.aula33labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Cria uma classe	para representar uma conta corrente	que	possui um n�mero, um saldo,	um status que informa se ela � especial	ou n�o,
 * um limite. Desenvolva m�todos para realizar saque (verificando se o cliente pode	realizar saques),despositar	dinheiro,consultar saldo e 
 * verificar se	o cliente est� usando cheque especial ou n�o. Desenvolva um	programa para testar essa classe. Criando	todos os atributos
 * do tipo privado, m�todos	getters e setters e construtores. Os m�todos que ser�o utilizados pela classe de teste devem ser p�blicos.	
 * Se necess�rio, crie m�todos privados	como auxiliares	para organizar melhor o	c�digo	fonte	tamb�m.
 */

public class Exercicio02 {
		public static void main (String []args) {
Scanner scan = new Scanner (System.in);
			
			ContaCorrente conta = new ContaCorrente ();
			
			conta.setNumero(1234);
			conta.setSaldo(1000);
			conta.setLimite(500);
			conta.isChequeEspecial(true);
			
			int opcao;
			double valor ;
			boolean sair = false;
			
			do {
				System.out.println("Digite a operacao que deseja efetuar: " );
				System.out.println("1 - Realizar Saque;" );
				System.out.println("2 - Depositar;" );
				System.out.println("3 - Consultar saldo;" );
				System.out.println("9 - Sair!" );
				opcao = scan.nextInt();
			
				switch (opcao) {
				case 1 : System.out.println ("Digite o valor que deseja sacar: ");
						 valor = scan.nextDouble();
						 conta.realizarSaque(valor);
				break;
				case 2 : System.out.println ("Digite o valor que deseja depositar: ");
				 		 valor = scan.nextDouble();
				 		 conta.depositar(valor);
					     ;
				break;
				case 3 : conta.consultarSaldo();
				break;
				case 9 : sair = true;
				break;
				default: System.out.println ("Digite uma opcao valida!!!");
				}
			
			} while (!sair);
		}
}
