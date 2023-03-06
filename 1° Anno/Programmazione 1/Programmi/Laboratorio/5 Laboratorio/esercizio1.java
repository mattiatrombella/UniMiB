import java.util.Scanner;

public class esercizio1{
  public static String aggiornaStringa(String s, int n){
    s = s + n;
    return s;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = "";
    int x;
    do{
      System.out.println("Inserisci un intero positivo oppure zero per terminare");
      x = input.nextInt();
      if(x<0)
        System.out.println("Il numero deve essere positivo");
      else if(x!=0)
        s = aggiornaStringa(s,x);

    }while(x!=0);

    System.out.println("La stringa di interi inseriti e' " + s);
  }
}
