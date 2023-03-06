import java.util.Scanner;
public class esercizio2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String parola = input.next();
    int lunghezza = parola.length();
    // verificare se parola è palindroma: anna
    Boolean palindroma = true;
    int index = 0;
    while(palindroma && index < lunghezza/2){

      if(parola.charAt(index) != parola.charAt(lunghezza - 1 - index)){
        palindroma = false;
      }

      index++;

    }
    if(palindroma)
      System.out.println("La parola e' palindroma");
    else
    System.out.println("La parola non e' palindroma");
  }
}
