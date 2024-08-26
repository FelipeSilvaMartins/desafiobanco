package desafiodiobanco;

public class ContaPoupança extends Conta {

	public ContaPoupança(String clientes, int agenciaPadrao, int sequencia) {
		super(clientes, agenciaPadrao, sequencia);	}

	public void imprimirExtrato() {
		
		System.out.println("==== Extrato Conta Corrente=====");
		imprimirExtratoComum();
		
	}
		

}
