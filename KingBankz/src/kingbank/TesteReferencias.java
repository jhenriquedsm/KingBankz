package kingbank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 450;
		
		System.out.println("Saldo da primeira conta: " 
		+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " 
		+ segundaConta.saldo);
		
		segundaConta.saldo += 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta); // vão ser a mesma conta, pois são referencias ao mesmo objeto
	}

}
