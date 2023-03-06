//22-03-2022
//i metodi possono essere di istanza o di classe
//se dichiaro un metodo privato può essere usato solo all'interno della classe in cui è definito
//per definire un metodo di classe uso la keyword "static"
//se il metodo è sottolineato nel diagramma significa che è un metodo di classe

public class Rettangolo{
  public int base; //è visibile anche all'interno dei metodi
  public int altezza;

  //il costruttore serve ad inizializzare l'oggetto con dei valori
  public Rettangolo(int base, int altezza){
    this.base = base;
    this.altezza = altezza;
  }

  //costruttore se non vengono inseriti parametri, per fare in modo che se
  //l'utente si dimentica, quando crea l'oggetto compila comunque
  public Rettangolo(){
    this(1,1);//questa istruzione chiama l'altro costruttore, inzializzando base e altezza a 1
  }

  public int calcolaArea(){
    int area = this.base * this.altezza;
    return area;
  }

  public boolean equals(int base, int altezza){
    if(this.base == base && this.altezza == altezza)
      return true;
    return false;
  }

  public String toString(){
    String stato;
    int area = this.calcolaArea();
    stato = "Rettangolo con base " + base +
      ", altezza: " + altezza +
      " e area: " + area;
      return stato;
  }

  public boolean equals(Rettangolo rettangolo){
    // if(rettangolo != null)
    //   if(base == rettangolo.base && altezza == rettangolo.altezza)
    //     return true;
    //   return false;
    // if(rettangolo == null)
    //   return false
    if(rettangolo == null)
      return false;
    if(rettangolo == this)
      return true;

    return this.equals(rettangolo.base, rettangolo.altezza);
  }




}
