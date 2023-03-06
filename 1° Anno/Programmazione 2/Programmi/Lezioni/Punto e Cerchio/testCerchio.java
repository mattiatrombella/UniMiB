public class testCerchio{
  public static void main(String[] args) {
    Punto p1 = new Punto();
    p1.x = 1;
    p1.y = 1;
    Cerchio c1 = new Cerchio();

    c1.raggio = 1;
    c1.centro = p1; //il valore iniziale del centro senza assegnargli p1 è null, non zero

    System.out.println(c1.centro.x); //stampo la x del centro del Cerchio

    Cerchio c2 = new Cerchio();
    c2.raggio = 1;

    c2.centro = new Punto(); //posso creare al momento il punto e assegnare successivamente i valori alla x e alla y
    c2.centro.x = 1;
    c2.centro.y = 1;

    boolean esito = c1.raggio == c2.raggio && c1.centro.x == c2.centro.x && c1.centro.y == c2.centro.y;
    System.out.println(esito);


  }
}
