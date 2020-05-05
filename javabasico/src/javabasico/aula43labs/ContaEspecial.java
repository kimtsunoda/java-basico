package javabasico.aula43labs;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public void sacar (double valor) {
		if ((getSaldo() +limite) >= valor) {
			setSaldo( getSaldo() - valor);
			System.out.println("Saque Realizado com Sucesso. O novo saldo é " + getSaldo() );
		}else
		System.out.println("Saldo Insuficiente. O Saldo diponivel para saque é de " + (getSaldo() +limite));
	}
}
