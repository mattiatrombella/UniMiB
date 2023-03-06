package esercizio1;

public class Impiegati extends Dipendente{
	
	public Impiegati(String nome, int matricola, double stipendioMensile) {
		super(nome, matricola, stipendioMensile);
	}

	@Override
	public double calcolaRal() {
		double ral = 13 * super.getStipendioMensile();
		return ral;
	}
}
