package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	private double totalNote;
	
	public double getTotalNote() {
		return totalNote;
	}
	
	public void setTotalNote() {
		this.totalNote = nota1 + nota2 + nota3;
	}
	
	
	public void verifyStatus() {
		
		if ( getTotalNote() > 60) {
			System.out.println("Aprovado");
		}else {
			double requiredPoints =  Math.abs(getTotalNote() - 60);
			System.out.println("Reprovado");
			System.out.println("Faltou " + requiredPoints + " Pontos");
		}
	}

}
