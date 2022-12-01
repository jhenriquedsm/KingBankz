package kingbankz;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public boolean deposita(double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		} 
		return false;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
