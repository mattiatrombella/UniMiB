public class programma{
  public static void main(String[] args) {

    int v;
    int w;

    Punto p1;
    Punto p2;

    //assegnamo un valore
    v=3;
    w=3;

    p1 = new Punto();
    p2 = new Punto();

    boolean esito = false;
    if(v==w)
      esito = true;

    System.out.println(esito);

    p1.x = 1;
    p2.x = 1;
  }
}
