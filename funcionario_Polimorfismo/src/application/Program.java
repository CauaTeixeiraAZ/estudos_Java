package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for ( int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Terceirizado (s|n)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			int hours = sc.nextInt();
			
			System.out.print("Valor por Hora: ");
			double valuePerHour = sc.nextDouble();
			
			if ( ch == 's') {
				System.out.print("Taxa adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}

}
