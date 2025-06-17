package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// criação da lista
		List<String> list = new ArrayList<>();
		
		// adição de novos elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		
		System.out.println(list.size());
		
		// percorre a lista
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		// remove todos os elementos que começam com M
		list.removeIf(x -> x.charAt(0) == 'M' );
		

		for (String x : list) { 
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		//mostra o index do elemento procurado, caso n ache retorna -1
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------------------");
		
		//exibe todos os elementos que começam com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		// exibe o primeiro elemento encontrado que começa com a letra A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); 
		System.out.println(name);
		
		
		
		
	}

}
