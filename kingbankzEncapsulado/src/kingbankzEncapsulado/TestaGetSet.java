package kingbankzEncapsulado;

public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(5502, 77777);
		
		System.out.println(conta.getNumero());
		
		Cliente henrique = new Cliente();
		// conta.titular = henrique;
		conta.setTitular(henrique);
		henrique.setNome("Henrique da Silva");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println();
		System.out.println(titularDaConta);
		System.out.println(henrique);
		System.out.println(conta.getTitular());
	}
}
