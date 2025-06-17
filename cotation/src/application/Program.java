package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converte = new CurrencyConverter();
		
		System.out.println("What is dollar price? ");
		converte.cotation = sc.nextDouble();
		
		System.out.println("How many dollars wil be bought?" );
		converte.dolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter());
		
		sc.close();
	}

}
