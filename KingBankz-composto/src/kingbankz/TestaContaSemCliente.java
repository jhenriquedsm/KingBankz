package kingbankz;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaTheo = new Conta();
		System.out.println(contaTheo.getSaldo());
		
		contaTheo.titular = new Cliente();
		System.out.println(contaTheo.titular);
		
		contaTheo.titular.nome = "Théo";
		System.out.println(contaTheo.titular.nome);
	}
}
