import java.util.Scanner;

public class esercizio2{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String frase = input.nextLine();
    int i, somma=0;

    for(i=0;i<(frase.length() - 1); i++){
      if(frase.charAt(i) == ' ')
        somma++;
    }

    if(somma == 0 && (frase.length() != 0)){
      System.out.println("La frase contiene una sola parola");
      System.out.println("La parola e' " + frase + " ed e' lunga " + frase.length());
    }else if(somma >= 1){

      System.out.println("La frase contiene 2 o piu' parole");
      String p1 = frase.substring(0, frase.indexOf(" "));
      String p2 = frase.substring((frase.lastIndexOf(" ") + 1), frase.length());
      System.out.println("La prima parola e' " + p1 + " ed e' lunga "+ p1.length() + " e la seconda parola e' " + p2 + " ed e' lunga " + p2.length());

    }else{
      System.out.println("La frase non contiene parole");
    }



    // System.out.println(frase.length());

  }
}
