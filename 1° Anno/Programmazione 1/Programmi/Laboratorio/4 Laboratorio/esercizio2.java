import java.util.Scanner;

public class esercizio2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci la prima stringa");
    String s1 = input.next();

    System.out.println("Inserisci la seconda stringa");
    String s2 = input.next();
    int n;
    if(s1.length() >= s2.length())
      n = s2.length();
    else
      n = s1.length();

    int i = 0;
    boolean uguali = true;
    int num = 0;
    while(i<n){
      if(s1.charAt(i) == s2.charAt(i))
        num++;
      else
        break;
      i++;
    }

    System.out.println("Il massimo prefisso comune tra le stringhe " + s1 + " e " + s2 + " e' " + num);
  }
}
