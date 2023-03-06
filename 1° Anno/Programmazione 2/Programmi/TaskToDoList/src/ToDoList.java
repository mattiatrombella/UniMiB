public class ToDoList {
	public Task toDo[];
	
	public ToDoList(int max) {
		if(max <= 0)
			toDo = new Task[5];
		else
			toDo = new Task[max];
	}
	
	public int getDurataTaskGiorno(int data) {
		int somma = 0;
		for(int i=0;i<toDo.length;i++) 
			if(toDo[i] != null && toDo[i].getData() == data) 
				somma += toDo[i].getDurata();
		return somma;
	}
	
	public int getPosizioneTask(Task task) {
		if(task != null) 
			for(int i=0;i<toDo.length;i++) 
				if(toDo[i] != null && toDo[i].equals(task))
					return i;
		return -1;
	}
	
	public boolean aggiungiTask(Task task) {
		if(task == null)
			return false;
		boolean inserisci = true;
		if(task.getDurata() + getDurataTaskGiorno(task.getData()) >8) 
			return false;
		
		for(int i=0;i<toDo.length;i++) 
			if(toDo[i] != null && toDo[i].equals(task)) 
				return false;
		
		for(int i=0;i<toDo.length;i++) {
			if(toDo[i] == null) {
				toDo[i] = task;
				return true;
			}else
				inserisci = false;
		}
		return inserisci;
						
		
	}
	
	public boolean aggiungiTask(String titolo, int durata) {
		Task task = new Task(titolo, durata);
		
		boolean inserisci = true;
		if(task.getDurata() + getDurataTaskGiorno(task.getData()) >8) 
			return false;
		
		for(int i=0;i<toDo.length;i++) 
			if(toDo[i] != null && toDo[i].equals(task)) 
				return false;
		
		for(int i=0;i<toDo.length;i++) {
			if(toDo[i] == null) {
				toDo[i] = task;
				return true;
			}else
				inserisci = false;
		}
		return inserisci;
						
		
	}
	
	public boolean rimuoviTask(Task task) {
		if(task != null) {
			for(int i = 0;i<toDo.length;i++) {
				if(toDo[i] != null && toDo[i].equals(task)) {
					toDo[i] = null;
					return true;
				}
			}
		}
		return false;
		
	}
}
