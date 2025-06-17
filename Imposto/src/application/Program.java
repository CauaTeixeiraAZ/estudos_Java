package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao registradas?");
		int num = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		
		for(int i = 0; i < num; i++) {
			System.out.println();
			
			System.out.println("Digite as informacoes da " + (i+1) + " pessoa: ");
			System.out.print("Pessoa fisica ou juridica? ( f|j ): ");
			char c = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(c == 'f') {
				System.out.print("Gastos com saude: ");
				Double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}else {
				if(c == 'j') {
					System.out.print("Quantidade de  Funcionarios: ");
					int numFuncionarios = sc.nextInt();
					
					list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
				}else {
					System.out.println("Opção invalida!");
				}
			}
			
		}
		System.out.println();
		System.out.println("Taxas pagas:");
		double sum = 0.0;
		for(Pessoa ac : list) {
			System.out.println(ac.toString());
			
			sum += ac.imposto();
		}
		
		System.out.println();
		System.out.println("Total de imposto: $" + sum);
		
		sc.close();
	}

}
