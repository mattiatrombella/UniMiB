import java.util.Scanner;

public class esercizio1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String s;
    do{
      System.out.println("Inserisci una parola o fine per terminare");
      s = input.next();
      if(s.charAt(0) == s.charAt(s.length() - 1))
        System.out.println("La prima e l'ultima lettera sono uguali");

    }while(!(s.equals("fine")));
  }
}
