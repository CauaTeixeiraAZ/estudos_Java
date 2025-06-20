package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero de Linhas: ");
		int m = sc.nextInt();
		System.out.print("Informe o numero de colunas: ");
		int n = sc.nextInt();
		System.out.println();
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		

		System.out.print("Digite um numero da matriz: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] == num) {
					System.out.println();
					System.out.println("Posicao (" + i + "," + j + "):");
					if( j > 0) {						
						System.out.println("Numero a esquerda: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Numero a cima: " + mat[i-1][j]);						
					}
					if( j < mat[i].length-1) {
						System.out.println("Numero a direita: " + mat[i][j+1]);						
					}
					if(i < mat.length - 1) {
						System.out.println("Numero abaixo: " + mat[i+1][j]);						
					}
				}
			}
		}
		
		
		sc.close();
	}

}
