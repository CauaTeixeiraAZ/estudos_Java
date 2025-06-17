package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int negativos = 0;
		
		for (int i = 0; i < mat.length ; i++) {
			for ( int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					negativos++;
				}
				
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int i = 0; i< mat.length;i++) {
			System.out.print(mat[i][i] + " "
		);}
		System.out.println();
		System.out.println("Quantidade de numeros Negativos = " + negativos);
		
		
		sc.close();
	}

}
