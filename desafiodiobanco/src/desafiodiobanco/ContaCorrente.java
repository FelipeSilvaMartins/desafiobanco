package desafiodiobanco;

public class ContaCorrente extends Conta {

	public ContaCorrente(String client, int agenciaPadrao, int sequencia) {
		super(client, agenciaPadrao, sequencia);
	}

	public void imprimirExtrato() {
		
		System.out.println("==== Extrato Conta Corrente=====");
		imprimirExtratoComum();
		
	}
		
}
