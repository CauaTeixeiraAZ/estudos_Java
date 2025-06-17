package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employe;

public class Program {
	public static void main(String[] args) {
		
		List<Employe> list = new ArrayList<>();
		String path = "c:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeCsv = br.readLine();
			while (employeCsv != null) {
				String[] fields = employeCsv.split(",");
				list.add(new Employe(fields[0], Double.parseDouble(fields[1])));
				employeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for (Employe emp: list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
		}catch (IOException e	) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
