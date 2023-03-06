public class Libro {
	private String autore;
	private String titolo;
	private int numeroPagine;
	
	public Libro(String autore, String titolo, int numeroPagine) {
		super();//non cambia nulla, possiamo lasciarlo o cancellarlo
		this.autore = autore;
		this.titolo = titolo;
		this.numeroPagine = numeroPagine;
	}
	
	public String getAutore() {
		return autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public boolean equals(Libro altro) {
		if(altro == null)
			return false;
		if (this.autore.equalsIgnoreCase(altro.autore) && this.titolo.equalsIgnoreCase(altro.titolo))
			return true;
		if(this == altro)
			return true;
		return false;
	}
	
	
}
