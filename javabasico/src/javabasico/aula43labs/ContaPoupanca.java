package javabasico.aula43labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
		private int diaRendimento;

		public int getDiaRendimento() {
			return diaRendimento;
		}

		public void setDiaRendimento(int diaRendimento) {
			this.diaRendimento = diaRendimento;
		}
		
		public String toString () {
			String s = "ContaPoupanca[";
			s += " diaRendimento: " + diaRendimento + " ";
			s += super.toString();
			s += " ]";
			return s;
		}
		
		public void calcularNovoSaldo (double taxaRendimento) {
			
			Calendar hoje = Calendar.getInstance();
			
			if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
				this.setSaldo(this.getSaldo()+ (this.getSaldo() * taxaRendimento));
				System.out.println("Rendimento aplicado. Seu novo saldo � " + this.getSaldo());
			} else {
				System.out.println("Hoje nao � dia de rendimento. Saldo nao alterado");
			}
		}
}
