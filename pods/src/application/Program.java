package application;

public class Program {
	public static void main(String[ ] args) {
		
		int quantidade = 20;
		
		double valor = 39.75;
		double preco = (int) Math.ceil(valor + (valor * 0.522));
		double atacado = valor * quantidade;
		double sobra = 0;
		double lucro = 0;
		double lucroLiquido = 0;
		double custo = 0;
		
		System.out.println("____________________________________________________________________________________");
		System.out.println("|       |            |            |            |               |                    |");
		System.out.println("|   #   | Quantidade |   custo    |   lucro    | lucro liquido | sobra dos liquidos |");
		System.out.println("|_______|____________|____________|____________|_______________|____________________|");
		
		for(int i = 1; i <= 10; i++) {
			
			quantidade += (int) (10 * Math.floor(lucroLiquido/atacado));
			custo = valor * quantidade;
			lucro = preco * quantidade;
			lucroLiquido = lucro - custo + sobra; 
			sobra = lucroLiquido; 
			
			if(sobra >= atacado) {
				
				sobra -= atacado * (lucroLiquido /atacado);
			}
			
			System.out.printf("| %-5d | %-10d | %-10.2f | %-10.2f | %-13.2f | %-18.2f |\n", i, quantidade, custo, lucro, lucroLiquido, sobra);
		
						
		}
		System.out.println("|_______|____________|____________|____________|_______________|____________________|");

		
	}
}
