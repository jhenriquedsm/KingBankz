package kingbankz;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente joseHenrique = new Cliente();
		joseHenrique.nome = "José Henrique";
		joseHenrique.cpf = "123.456.789-00";
		joseHenrique.profissao = "Desenvolvedor Java";
		
		Conta contaJoseHenrique = new Conta();
		contaJoseHenrique.deposita(1500);
		
		contaJoseHenrique.titular = joseHenrique; // -> associa o cliente joseHenrique a contaJoseHenrique
		System.out.println(contaJoseHenrique.titular.nome);
		System.out.println(contaJoseHenrique.titular);
		System.out.println(joseHenrique);
	}
}
