package desafiodiobanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		int opcao;
		int j;
		// Classe Banco que recebera as contas em uma lista
		Banco bradesco = new Banco();

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	System.out.println("Nome do Cliente: ");
                	
                	String clienteString = scanner.next();
                	Conta cc = new ContaCorrente(clienteString,Banco.getAgenciaPadrao(),Banco.getSEQUENCIAL());
                	bradesco.setConta(cc);
                	System.out.println("Conta criada com sucesso!!!! ");
                	System.out.println("Sua agencia: " + cc.getAgencia());
                	System.out.println("Sua conta: " + cc.getNumero());
               	
                    break;
                case 2:
                	scanner.nextLine();
                	System.out.println("====CONSULTA DE SALDO====== ");
                	System.out.println("Numero da conta: ");
                	j = scanner.nextInt();
                	bradesco.getConta(j).imprimirExtrato();
                	

                    break;
                case 3:
                	scanner.nextLine();
                	System.out.println("=====DEPOSITO====== ");
                	System.out.println("Numero da Conta: ");
                	j = scanner.nextInt();
                	System.out.println("Valor:  ");
                	double valor = scanner.nextInt();
                	bradesco.getConta(j).depositar(valor);
                	System.out.println("Deposito Realizado ");
                    break;
                case 4:
                	scanner.nextLine();
                	System.out.println("=====SAQUE====== ");
                	System.out.println("Numero da Conta: ");
                	j = scanner.nextInt();
                	System.out.println("Valor:  ");
                	double valor1 = scanner.nextInt();
                	bradesco.getConta(j).sacar(valor1);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
	
		
		//Classe que recebe apenas o nome
				
		//Classes de poupanca e conta corrente que recebe o objeto cliente.
	
	//	Conta poupanca= new ContaPoupança(venilton);
		
		//Objeto banco que recebe o objeto Conta e insere em uma lista de contas
	
	//	bradesco.setConta(poupanca);
		
	//	cc.depositar(100);
	//	cc.transferir(50, poupanca);
		
	//	poupanca.imprimirExtrato();
	//	bradesco.getConta(0).imprimirExtrato();
	//	poupanca.depositar(253);
	//	cc.depositar(1000);
	//	bradesco.getConta(0).depositar(456);
	//	bradesco.getConta(0).imprimirExtrato();
	//	poupanca.imprimirExtrato();
		
		

	}
	
    private static void exibirMenu() {
    	System.out.println("\n==== MENU BANCO ====");
        System.out.println("1. Criar Conta");
        System.out.println("2. Consultar Saldo");
        System.out.println("3. Realizar Deposito");
        System.out.println("4. Realizar Saque");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opcao: ");
    }

}
