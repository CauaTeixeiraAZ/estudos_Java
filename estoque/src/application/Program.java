package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number of products to cadastre: ");
		 int n = sc.nextInt();
		 
		 Product[] product = new Product[n];


		 
		 for(int i = 0; i < product.length; i++) {
			 System.out.println("Enter product " +(i+1) + " data: ");
			 sc.nextLine();
			 System.out.print("Name: ");			 
			 String name = sc.nextLine();
			 System.out.print("Price: ");
			 double price = sc.nextDouble();
			 
			 product[i] = new Product(name, price);
			 
		 }
		 
		 double sum = 0.0;
		 
		 for(int i = 0; i < product.length; i++) {
			 sum = product[i].getPrice();
		 }
		 double avg = sum / product.length;
		 
		 System.out.printf("media de valores: %.2f%n", avg);
		 
		 
		 System.out.println();
		 System.out.println(" Product data: " + product);
		 
//		 System.out.println();
//		 System.out.print("Enter the number of products to be added in the stock: ");
//		 int quantity = sc.nextInt();
//		 product.addProducts(quantity);
//		 
//		 System.out.println();
//		 System.out.println("Product data: " + product);
//		 
//		 System.out.println();
//		 System.out.print("Enter the number of products to be removed from the stock: ");
//		 quantity = sc.nextInt();
//		 product.removeProducts(quantity);
//		 
//		 System.out.println("\n Product data: " + product);
//			
		 
		 
		 sc.close();
	}

}
