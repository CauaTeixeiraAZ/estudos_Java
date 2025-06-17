package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Contas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Contas conta;

		System.out.println("Informe o numero da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.println("Informe o dono da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Sera feito um deposito inicial(y/n)? ");
		String control = sc.nextLine();
		
		if( control == "y" ) {
			System.out.print("Informe o valor do deposito inicial: ");
			double deposito = sc.nextDouble();
			conta = new Contas(numeroDaConta, nome, deposito );	
		}else {
			conta = new Contas(numeroDaConta, nome);	
		}
		

		
		System.out.println("");
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		
		System.out.println("");
		System.out.println("Qual sera o valor do deposito? ");
		conta.deposito(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("");
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		
		System.out.println("");
		System.out.println("Qual sera o valor de saque? ");
		conta.saque(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("");
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		
		
		sc.close();
		
		
		
	}

}
