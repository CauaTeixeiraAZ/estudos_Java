package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Digite o nome do aluno: ");
		student.name = sc.nextLine();
		
		System.out.println("Informe a primeira nota do aluno: ");
		student.nota1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota do aluno: ");
		student.nota2 = sc.nextDouble();
		
		System.out.println("Informe a terceira nota do aluno: ");
		student.nota3 = sc.nextDouble();
		
		
		student.setTotalNote();
		System.out.println();
		System.out.println("Nota final: " + student.getTotalNote());
			
		student.verifyStatus();
		
		sc.close();
	}

}
