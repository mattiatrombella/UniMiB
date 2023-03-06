import java.util.Scanner;

public class esercizio3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci un numero intero positivo");
    int n =  input.nextInt();

    while(n<=0){
      System.out.println("Il numero deve essere positivo");
      n = input.nextInt();
    }

    if(n == 1){
      System.out.println("Numero letto 1 \n Fattori: 1 (1 volta)" );
      System.exit(0);
    }
    System.out.println("Numero letto: " + n);
    System.out.print("Fattori: ");

    int fattore = 2;
    int numeroVolte = 0;
    boolean primaStampa = true;
    while(n>1){
      while(n%fattore == 0){
        n= n/fattore;
        numeroVolte++;
      }
      if(numeroVolte > 0){
        if(!primaStampa)
          System.out.print(", ");
        primaStampa = false;
        System.out.print(fattore + " (" + numeroVolte);

        if(numeroVolte > 1)
          System.out.print(" volte)");
        else
          System.out.print(" volta)");
      }
      fattore++;
      numeroVolte = 0;
    }
  }
}
