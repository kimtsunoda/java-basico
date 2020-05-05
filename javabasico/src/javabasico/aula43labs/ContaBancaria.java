package javabasico.aula43labs;

public class ContaBancaria {
	private String nomeCliente;
	private String numeroConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}
	
	public void depositar (double valor) {
		saldo += valor;
		System.out.println("Deposito Realizado");
	}
	
	public void sacar (double valor) {
		if((saldo-valor) >= 0) {
			saldo -= valor;
			System.out.println("Saque Realizado com Sucesso. O novo saldo é " + saldo );
		} else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
}
