package javabasico.aula43labs;

/**
 * @author Kim Tsunoda
 * Objetivo : Conta Bancaria. Elabore uma classe ContaBancaria com os atributos (nomeCliente, numConta, Saldo) e os metodos (sacar, depositar).
 * Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características: ContaPoupanca (atributo diaRendimento,
 * método calcularNovoSaldo, recebe taxa de rendimento da poupaça e atualiza o saldo) ContaEspecial (atributo limite, sobrescreva o método sacar com 
 * a nova lógica necessária). Crie uma classe que contenha a seguinte lógica: (Criar contas, Sacar um valor das contas, Depositar, Mostrar um novo
 * saldo a partir de um rendimento, Mostrar os dados da conta do cliente).
 */

public class Exercicio01 {

	public static void main(String[] args) {
		
	ContaBancaria contaSimples = new ContaBancaria();
	contaSimples.setNomeCliente("Cliente Simples");
	contaSimples.setNumeroConta("1111-S");
	
	System.out.println("*** Teste Conta Simples ***");
	
	contaSimples.depositar(1000);
	contaSimples.sacar(500);
	contaSimples.sacar(600);
	
	System.out.println(contaSimples);
	
	ContaPoupanca contaPoupanca = new ContaPoupanca();
	contaPoupanca.setNomeCliente("Cliente Poupanca");
	contaPoupanca.setNumeroConta("2222-P");
	contaPoupanca.setDiaRendimento(4);
	
	System.out.println(" \n*** Teste Conta Poupanca ***");
	
	contaPoupanca.depositar(800);
	contaPoupanca.sacar(500);
	contaPoupanca.calcularNovoSaldo(0.5);
	
	System.out.println(contaPoupanca);
	
	ContaEspecial contaEspecial = new ContaEspecial();
	contaEspecial.setNomeCliente("Cliente Especial");
	contaEspecial.setNumeroConta("2222-P");
	contaEspecial.setLimite(500);
	
	System.out.println(" \n*** Teste Conta Especial ***");
	
	contaEspecial.depositar(800);
	contaEspecial.sacar(1500);
	contaEspecial.sacar(1000);
	contaEspecial.depositar(150);
	
	System.out.println(contaEspecial);
	
	}

	
}
