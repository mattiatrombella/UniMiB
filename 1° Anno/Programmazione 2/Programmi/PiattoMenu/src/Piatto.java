import java.util.Objects;

public class Piatto {
	public static final int ANTIPASTO = 0;
	public static final int PRIMO = 1;
	public static final int SECONDO = 2;
	public static final int CONTORNO = 3;
	public static final int DOLCE = 4;
	
	private String nome;
	private int tipo;
	private int costo;
	
	public Piatto(String nome, int tipo, int costo) {
		this.nome = nome;
		this.tipo = tipo;
		this.costo = costo;
	}

	public String getNome() {
		return nome;
	}

	public int getTipo() {
		return tipo;
	}

	public int getCosto() {
		return costo;
	}


	public boolean equals(Piatto altro) {
		if(altro == null)
			return false;
		if(this == altro)
			return true;
		if(nome == null) {
			if(altro.nome != null)
				return false;
		}else if(!nome.equalsIgnoreCase(altro.nome))
			return false;
		if(tipo!=altro.tipo) {
			return false;
		}
		return true;
	}


	
	
	
	
}
