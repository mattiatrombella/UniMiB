import java.util.Scanner;

public class esercizio1{

  public static void implicazioni(boolean a, boolean b, boolean c){

    System.out.println("a --> b" + (!a || b));
    
  }
  public static void main(String[] args) {
    boolean a,b,c;

    Scanner input = new Scanner(System.in);

    boolean valA, valB, valC;

    System.out.println("Inserisci il valore della proposizione A: ");
    valA = input.nextBoolean();

    System.out.println("Inserisci il valore della proposizione B: ");
    valB = input.nextBoolean();

    System.out.println("Inserisci il valore della proposizione C: ");
    valC = input.nextBoolean();

    implicazioni(valA, valB, valC);
  }
}
