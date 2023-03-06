public class Task {
	private String titolo;
	private int data;
	private boolean eseguito;
	private int durata;
	
	public void setTitolo(String titolo) {
		if(titolo != null && !titolo.isEmpty()) 
			this.titolo = titolo;
		else
			this.titolo = "Da specificare";
	}
	
	public void setData(int data) {
		if(data >= DataUtil.getDataDiOggi()) 
			this.data = data;
		else
			this.data = DataUtil.getDataDiOggi();
	
	}
	
	public void setDurata(int durata) {
		if(durata>=1 && durata<=8)
			this.durata = durata;
		else
			this.durata = 1;
	}
	
	public Task(String titolo, int data, int durata) {
		if(titolo != null && !titolo.isEmpty()) 
			this.titolo = titolo;
		else
			this.titolo = "Da specificare";
		
		if(data >= DataUtil.getDataDiOggi()) 
			this.data = data;
		else
			this.data = DataUtil.getDataDiOggi();
		
		if(durata>=1 && durata<=8)
			this.durata = durata;
		else
			this.durata = 1;
		this.eseguito = false;
	}
	
	public Task(String titolo, int durata) {
		if(durata>=1 && durata<=8)
			this.durata = durata;
		else
			this.durata = 1;
		
		if(titolo != null && !titolo.isEmpty()) 
			this.titolo = titolo;
		else
			this.titolo = "Da specificare";
		
		this.data = DataUtil.getDataDiOggi();
		this.eseguito = false;
		
	}

	public String getTitolo() {
		return titolo;
	}

	public int getData() {
		return data;
	}

	public int getDurata() {
		return durata;
	}
	
	public void eseguito() {
		this.eseguito = true;
	}
	
	public boolean isEseguito() {
		if(this.eseguito == true)
			return true;
		else 
			return false;
	}
	
	public boolean equals(Task task) {
		if(task != null) {
			if(this.getTitolo().equalsIgnoreCase(task.getTitolo()) && this.getData() == task.getData() && this.getDurata() == task.getDurata())
					return true;
		}
		return false;
	}
	
}
