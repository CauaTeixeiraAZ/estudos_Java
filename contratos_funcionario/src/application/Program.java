package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		
		System.out.print("Entre com o nome do departamento: ");
		String departament = sc.nextLine();
		
		System.out.println("Entre com os dados do funcionario ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		
		System.out.print("level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Entre com o salario base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departament));
		
		System.out.println();
		System.out.println("Quantos contratos esse funcionario tem? ");
		int n = sc.nextInt();
		
		for( int i = 0; i < n; i++) {
			System.out.println("Entre com os dados do #" + (i+1) + " contrato:");
			System.out.print("Data: (dd/mm/yyyy): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int hours = sc.nextInt();
			System.out.println();
			
			HourContract contract = new HourContract(date, valuePerHour, hours);
			
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Informe o mes e o ano para calcular o rendimento (mm/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Ganhos durante " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
