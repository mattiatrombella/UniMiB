package esercizio1;

public class Dirigenti extends Dipendente{
	private double benefit;

	public Dirigenti(String nome, int matricola, double stipendioMensile, double benefit) {
		super(nome, matricola, stipendioMensile);
		this.benefit = benefit;
	}

	@Override
	public double calcolaRal() {
		double ral = 14 * super.getStipendioMensile() + benefit;
		return ral;
	}
	
	
	
	

}
