import java.util.Scanner;
public class esercizio2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci un numero intero");

    int n = input.nextInt();

    int contatore = 1;
    while(contatore<=n){
      System.out.println(contatore);
      contatore++;
    }
  }
}
