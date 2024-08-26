package desafiodiobanco;


public abstract class Conta implements Iconta{

	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente clients2 = new Cliente();
	
	
	

	public Conta(String nome, int agenciaPadrao, int sequencia) {
		
		this.agencia = agenciaPadrao;
		this.numero = sequencia ;
		this.clients2.setNome(nome);;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	public void depositar(double valor) {
		this.saldo += valor;

		
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirExtratoComum() {
		System.out.println(String.format("Titular: %s", this.clients2.getNome()));

		System.out.println("Agencia: "+ this.agencia);
		System.out.println("numero: "+ this.numero);
		System.out.println("saldo: "+ this.saldo);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	protected double getSaldo() {
		return saldo;
	}
}
