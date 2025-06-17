package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Reservas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Reservas[] vct = new Reservas[10];
		
		System.out.println("Quantas reservas serao feitas? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Reserva #" + (i+1) +":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine()	;
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int numQuarto = sc.nextInt();
			
			
			vct[numQuarto] = new Reservas(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos reservados:");
		
		for(int i = 0; i< vct.length; i++) {
			if(vct[i] != null) {
				System.out.println(i + ": "+ vct[i]);
			}
		}
		
		
		sc.close();
	}

}
