package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list =  new ArrayList<>();
		
		System.out.println("Quantos funcionarios serao cadastrados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++) {
			System.out.println( );
			System.out.println("Fucionario #" + (i +1)+ ": ");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("Esse id ja existe! tente de novo: ");
				id = sc.nextInt();
			}
			System.out.print("Name:	");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			list.add(new Funcionario(id, name, salary));
			
		}
		System.out.println();
		System.out.print("Informe o ID do funcionario que recebera aumento: ");
		int idSalary = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idSalary).findFirst()	.orElse(null);
		
		if(func != null) {
			System.out.print("Informe a porcentagem: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}else {
			System.out.println("Este funcionario nao existe!");
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for(Funcionario x : list) {
			System.out.println(x);
		}
		
		
		sc.close();
	}
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}











