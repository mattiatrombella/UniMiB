
public class Scaffale {
	private Libro []libri;
	
	public Scaffale(int dimensione) {
		libri = new Libro[dimensione];
	}
	
	public Scaffale() {
		this(10);
	}
	
	public boolean aggiungiLibro(Libro libro) {
		if(libro!= null) {
			boolean trovata = false;
			for(int i = 0; i<libri.length && !trovata; i++) {
				if(libri[i] == null) {
					libri[i] = libro;
					trovata = true;
				}
			}
			return trovata;
		}
		return false;
	}
	
	public boolean aggiungiLibro(String autore, String titolo, int numeroPagine) {
		return aggiungiLibro(new Libro(autore, titolo, numeroPagine));	
	}
	
	private Libro rimuovi(int posizione) {
		if(posizione >= 0 && posizione < libri.length) {
			Libro temp = libri[posizione];
			libri[posizione] = null;
			return temp;
		}
		return null;
	}
	
}
