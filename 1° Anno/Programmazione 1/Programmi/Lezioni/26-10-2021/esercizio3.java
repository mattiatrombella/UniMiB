import java.util.Scanner;

public class esercizio3{

  public static void main(String[] args) {
    //contare numero vocali nella parola
    System.out.println("Inserisci una parola");
    
    Scanner input = new Scanner(System.in);
    String parola = input.next();
    int lunghezza = parola.length();

    int numeroVocali = 0;
    int i = 0;
    while (i < lunghezza){
      switch(parola.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          numeroVocali++;

      }
      i++;
    }
    System.out.println("La stringa contiene " + numeroVocali + " vocali e contiene " + (lunghezza - numeroVocali) + " consonanti");
  }
}
