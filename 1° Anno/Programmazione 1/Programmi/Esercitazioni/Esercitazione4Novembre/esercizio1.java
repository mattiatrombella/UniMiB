import java.util.Scanner;

public class esercizio1{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String risposta = "Si";


    int n = 0;
    while(risposta.equalsIgnoreCase("si")){
      n=0;
      while(n<=0){
        System.out.println("Inserisci un intero maggiore di zero");
        n = input.nextInt();
      }

      int somma=0, contatore=0;

      while(contatore<=n){
        somma+= (contatore*contatore);
        contatore++;
      }
      System.out.println("La somma e' " +  somma);
      System.out.println("Vuoi calcolare un'altra somma? (si/no)");
      risposta = input.next();
    }

  }
}
