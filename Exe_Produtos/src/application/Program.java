package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.importedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Product #" + (i+1) + " data:");
			System.out.print("Commun, used ou imported (c|u|i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(type){
				case 'c':
					list.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Manufacture date (dd/mm/yyyy): ");
					Date manufactureDate = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, manufactureDate));
					break;
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					list.add(new importedProduct(name, price, customsFee));
					break;
				default:
					System.out.println("Option invalid");		
			}			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");			
		for( Product product : list) {
			System.out.println(product.priceTag());
		}
		
		
		
		
		
	
	}

}
