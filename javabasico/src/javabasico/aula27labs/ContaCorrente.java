package javabasico.aula27labs;

public class ContaCorrente {
	int numero;
	double saldo;
	boolean chequeEspecial;
	double	limite;
	
	
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
	
	

