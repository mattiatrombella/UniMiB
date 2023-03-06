public class test{
  public static void main(String[] args) {
    Lettera lettera = new Lettera();

    lettera.mittente = new Persona();
    lettera.mittente.nome = "Pluto";
    lettera.mittente.indirizzo = "Milano";

    lettera.destinatario = new Persona();
    lettera.destinatario.nome = "Pippo";
    lettera.destinatario.indirizzo = "Roma";

    Lettera risposta1 = new Lettera();

  }


}
