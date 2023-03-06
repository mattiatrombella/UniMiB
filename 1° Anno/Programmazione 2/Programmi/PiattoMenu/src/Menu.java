public class Menu {
	private Piatto portate[];
	
	public Menu(int maxPortate) {
		if(maxPortate <= 0 || maxPortate >5)
			maxPortate = 5;
		portate = new Piatto[maxPortate];
	}
	
	public Menu() {
		this(5);
	}
	
	public int dimensioneMenu() {
		return portate.length;
	}
	
	public int tipoPiattoPresente(int tipo) {
		for(int i=0;i<portate.length; i++) {
			if(portate[i] != null && portate[i].getTipo() == tipo) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean aggiungiPiatto(Piatto piatto) {
		if(piatto != null && this.tipoPiattoPresente(piatto.getTipo()) == -1) {
			for(int i=0;i<portate.length; i++) {
				if(portate[i] == null) {
					portate[i] = piatto;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean rimuoviPiatto(Piatto piatto) {
		if(piatto == null)
			return false;
		for(int i=0; i<portate.length;i++) {
			if(portate[i] != null && portate[i].equals(piatto)) {
				portate[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public boolean sostituisciPiatto(Piatto piatto) {
		if(piatto == null)
			return false;
		int x = this.tipoPiattoPresente(piatto.getTipo());
		if(x!=-1) {
			portate[x] = piatto;
			return true;
		}
		return false;
	}
	
	public int calcolaCosto() {
		int somma = 0;
		for(int i=0;i<portate.length;i++) {
			if(portate[i]!=null) {
				somma+=portate[i].getCosto();
			}
		}
		return somma;
	}
}
