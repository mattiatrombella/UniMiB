import java.util.Scanner;

public class esercizio4{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci il primo intero");
    int n1 = input.nextInt();
    while(n1<1){
      System.out.println("Inserire un numero positivo");
      n1 = input.nextInt();
    }

    System.out.println("Inserisci il secondo intero");
    int n2 = input.nextInt();
    while(n2<1){
      System.out.println("Inserire un numero positivo");
      n2 = input.nextInt();
    }

    int i = 0;
    while(i<n2){
      n1++;
      i++;
    }
    System.out.println("La somma e' " + n1);

  }
}
