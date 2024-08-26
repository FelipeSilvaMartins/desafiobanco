package desafiodiobanco;

import java.util.ArrayList;



public class Banco {
	

	private static final int AGENCIA_PADRAO = 1;


	private static int SEQUENCIAL = 1;

	public static int getAgenciaPadrao() {
		return AGENCIA_PADRAO;
	}

	public static int getSEQUENCIAL() {
		return SEQUENCIAL;
	}

	
	private String nome;
	private ArrayList<Conta> contas2 = new ArrayList<Conta>();
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta(int i) {
		return contas2.get(i-1);
	}

	public void setConta(Conta contas) {
		int i = Banco.getSEQUENCIAL() - 1;
		contas2.add(i, contas);
		SEQUENCIAL++;

	}

	public ArrayList<Conta> getContas() {
		return contas2;
	}


}
