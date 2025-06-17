package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employer funcionario = new Employer();
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o salario do funcionario: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		funcionario.tax = sc.nextDouble();
		
		funcionario.netSalary();
		
		System.out.println();
		System.out.println("Employer data: " + funcionario);
		
		System.out.println("Em quantos porcento o salario almentara?");
		double aumento = sc.nextDouble();
		funcionario.increaseSalary(aumento);
		
		System.out.println();
		System.out.println("Employer data: " + funcionario);
		
		
		
		sc.close();
	}

}
