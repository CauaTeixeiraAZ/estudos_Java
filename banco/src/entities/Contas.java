package entities;

public class Contas {
	private int accountNum;
	private String name;
	private double saldo;
	
	
	public Contas(int accountNum, String name, double depositoInicial) {
		this.accountNum = accountNum;
		this.name = name;
		deposito(depositoInicial);
	}
	
	public Contas(int accountNum, String name) {
		this.accountNum = accountNum;
		this.name = name;
	}
	
	
	public int getAccountNum() {
		return accountNum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void deposito(double value) {
		saldo += value;
	}
	
	public void saque(double value){
		saldo -= value + 5.0;
	}
	
	public String toString() {
		return "Conta " 
				+ accountNum
				+ ", dono: " 
				+ name 
				+ ", saldo: $" 
				+ String.format("%.2f", saldo);
	}
	
}
