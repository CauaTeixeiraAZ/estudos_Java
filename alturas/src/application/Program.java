package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao cadastradas? ");
		int n = sc.nextInt();
		sc.nextLine();
		int cont = 0;

		Pessoas[] pessoas = new Pessoas[n];

		for( int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da "+(i+1)+ "a pessoa: ");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			
			pessoas[i] = new Pessoas(nome, idade, altura);
			
			if(idade <= 16 ) {
				cont++;				
			}
			
		}
		double sum = 0.0;
		
		for( int i = 0; i < pessoas.length; i++) {
			sum += pessoas[i].getAltura();
		}
		
		double mediaAltura = sum / pessoas.length;
		
		System.out.println("A altura media das pessoa é " + mediaAltura);
		
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() <= 16 ) {
				System.out.println(pessoas[i].getNome());
			}
		}
		
		
		sc.close();
		
		
	}
}
