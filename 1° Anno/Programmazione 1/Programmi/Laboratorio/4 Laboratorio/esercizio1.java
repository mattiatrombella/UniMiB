import java.util.Scanner;

public class esercizio1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci un intero n positivo");

    int n = input.nextInt();

    int potenza = 1;
    boolean maggiore = false;
    while(!maggiore){
      potenza*=2;
      if(potenza>n)
        maggiore = true;
    }
    System.out.println("La potenza di 2 piu' piccola maggiore di " +  n + " e' " +  potenza);
  }
}
