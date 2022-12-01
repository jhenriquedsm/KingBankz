package kingbankz;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		if(conta.saca(200)) {
			System.out.println("Saque concluído com sucesso!");
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque!");
			System.out.println("Saldo atual: " + conta.getSaldo());
		}
		System.out.println();
		
		if(conta.saca(40)) {
			System.out.println("Saque concluído com sucesso!");
			System.out.println("Saldo atual: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque!");
			System.out.println("Saldo atual: " + conta.getSaldo());
		}

	}
}
