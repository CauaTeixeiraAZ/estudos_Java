package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho de um arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome: " + path.getName());
		
		System.out.println("Caminho: " + path.getParent() );
		
		System.out.println("Caminho completo: " + path.getPath());
		
	}

}
