import java.util.Scanner;

public class esercizio1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int b, n;

    System.out.println("Inserisci la base");
    b = input.nextInt();
    System.out.println("Inserisci l'esponente n-esimo");
    n = input.nextInt();

    int potenza = 1;
    int contatore = 0;
    while(contatore<n){
      potenza *= b;
      contatore++;
    }
    System.out.println(b + " elevato a " + n + " fa " + potenza);
    

  }
}
