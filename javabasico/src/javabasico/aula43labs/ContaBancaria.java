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
	
	
}
