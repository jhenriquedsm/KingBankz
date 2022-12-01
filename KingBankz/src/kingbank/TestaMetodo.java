package kingbank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaHenrique = new Conta();
		if(contaHenrique.deposita(100)) {
			System.out.println("Depósito realizado com sucesso!");
			System.out.println("Saldo atual: " + contaHenrique.saldo);
		} else {
			System.out.println("Valor inválido!");
		}
		System.out.println();
		
		
		if(contaHenrique.saca(50)) {
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo atual: " + contaHenrique.saldo);
		} else {
			System.out.println("Saldo insuficiente para saque!");
		}
		System.out.println();
		
		Conta contaTheo = new Conta();
		contaTheo.deposita(1000);
		if(contaTheo.transfere(500, contaHenrique)) {
			System.out.println("Transferência realizada com sucesso!");
			System.out.println("Saldo atual: " + contaTheo.saldo);
		} else {
			System.out.println("Saldo insuficiente para transferir!");
		}
		
		System.out.println("Saldo do Henrique: " + contaHenrique.saldo);
		
		contaHenrique.titular = "Henrique da Silva";
		System.out.println(contaHenrique.titular);
	}
}
