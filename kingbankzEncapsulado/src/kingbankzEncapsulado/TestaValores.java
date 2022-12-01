package kingbankzEncapsulado;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(5502, 77777);
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println();
		
		Conta conta2 = new Conta(5502, 88888);
		System.out.println("Agencia: " + conta2.getAgencia());
		System.out.println();
		
		Conta conta3 = new Conta(4401, 65856);
		System.out.println("Agencia: " + conta3.getAgencia());
		System.out.println();
		
		System.out.println("Total de contas: " + Conta.getTotal());
	}

}
