package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithDrawException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Informe os dados da conta");
	
			System.out.print("Numero da conta: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String holder = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			double balance = sc.nextDouble();
			
			System.out.print("Limite para saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account conta = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Informe um valor para saque: ");
			double amount = sc.nextDouble();
			
			conta.withdraw(amount);
			
			
			
		}
		catch(WithDrawException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
}
