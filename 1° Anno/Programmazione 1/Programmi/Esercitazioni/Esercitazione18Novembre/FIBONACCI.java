import java.util.Scanner;
//programma che calcola la successione di fibonacci
public class esercizio1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = 0, f0 = 0, f1 = 1, fn = 0;

    do{
      System.out.println("Inserisci il valore di n:");
      n = input.nextInt();
      if(n<=1)
        System.out.println("Devi inserire un numero maggiore di 1");

    }while(n<=1);

    for(int i = 3; i<=n; i++){
      f0 = f1;
      f1 = fn;
      fn= f0 + f1;

    }

    System.out.println("L'n-esimo numero di Fibonacci e': " + fn);
  }
}
