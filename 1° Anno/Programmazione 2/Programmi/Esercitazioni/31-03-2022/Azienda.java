public class Azienda{
  public String nome;
  public Dipendente dipendenti[];
  public String toString(){
    String s = "Azienda: nome="+ this.nome + ", dipendenti=[";
    if (dipendenti != null){
      for(int i=0;i < this.dipendenti.length; i++){
        s= s + dipendenti[i].toString() + ",";
      }
    }
    s = s + "]";
    return s;
  }

  public double calcolaCosto(){
    double c = 0.0 ;
    if (dipendenti != null)
      for(int i=0; i<this.dipendenti.length;i++)
        if (dipendenti[i] != null)
          c += this.dipendenti[i].costo;

    return c;
  }
}
