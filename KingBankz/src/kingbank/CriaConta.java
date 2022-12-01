package kingbank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		System.out.println("Saldo da primeira conta: " 
		+ primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.println("Saldo da segunda conta: " 
		+ segundaConta.saldo);
		segundaConta.titular = "José Henrique";
		// System.out.println(segundaConta.titular);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		primeiraConta.agencia = 120;
		System.out.println(primeiraConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
