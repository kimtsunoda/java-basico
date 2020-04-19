package javabasico.aula33labs;

public class ContaCorrente {
				private int numero;
				private double saldo;
				private boolean chequeEspecial;
				private double limite;
				
				public int getNumero() {
					return numero;
				}
				
				public void setNumero(int numero) {
					this.numero = numero;
				}
				
				public double getSaldo() {
					return saldo;
				}
				
				public void setSaldo(double saldo) {
					this.saldo = saldo;
				}
				
				public void isChequeEspecial(boolean chequeEspecial) {
					this.chequeEspecial = chequeEspecial;
				}
				
				public double getlimite() {
					return limite;
				}
				
				public void setLimite(double limite) {
					this.limite = limite;
				}
				
				void realizarSaque (double valor) {
					if (saldo >= valor) {
						saldo -= valor;
						System.out.println("Saque realizado com Sucesso" );
					} else if (chequeEspecial == true && (saldo + limite) >= valor) {
						 saldo -= valor;
						 System.out.println("Saque realizado com Sucesso");
						 usandoLimite(); 
					} else {
						System.out.println("Conta nao tem saldo suficiente!!!");
					}
				}
				
				void depositar (double valor) {
					saldo = saldo + valor;
					System.out.println("Deposito Realizado");
				}	
				
				void consultarSaldo () {
					System.out.println("Saldo é " + saldo );
				}
				
				void usandoLimite () {
					System.out.println("Seu limite é " + limite + " e voce ja usou " + (limite + saldo));
				}
				
				
}
