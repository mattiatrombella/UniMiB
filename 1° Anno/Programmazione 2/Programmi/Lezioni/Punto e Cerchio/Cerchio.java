public class Cerchio{
  public int raggio;
  public Punto centro;

  public Cerchio(){
    this(1);
  }

  public Cerchio(Cerchio cerchio){
    this(cerchio.raggio, cerchio.centro);
  }

  public setRaggio(int raggio){
    
  }

  public void setCentro(Punto centro){
    if(centro != null)
      this.centro = centro;
    else
      this.centro = new Punto();
  }

  public int getRaggio(){
    return this.raggio;
  }

  public Punto getCentro(){
    return this.centro;
  }

  public void Cerchio(){
    this.raggio = 1;
  }

  public boolean equals(Cerchio cerchio){
    if(cerchio==null)
      return false;

    if(this == cerchio)
      return true;
    if(this.raggio == cerchio.raggio && this.centro.x == cerchio.centro.x && this.centro.y == cerchio.centro.y)
      return true;


  }
}
