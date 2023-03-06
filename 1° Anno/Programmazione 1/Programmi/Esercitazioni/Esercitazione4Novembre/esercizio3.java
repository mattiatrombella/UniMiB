import java.util.Scanner;

public class esercizio3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int contatore=0;
    String stringa1 = "", stringa2 ="";
    boolean uguali = false;

    while(!uguali){
      System.out.println("Dammi una stringa");
      stringa1 = input.next();
      System.out.println("Dammi una seconda stringa");
      stringa2 = input.next();

      uguali = stringa1.length() == stringa2.length();
      // if(!uguali){
      //   System.out.println("Lunghezze delle stringhe diverse");
      //   System.exit(0);
      // }

    }
    while(contatore<stringa1.length() && uguali)  {
      if(stringa1.charAt(contatore) == stringa2.charAt(contatore)){
        contatore++;
      }else{
        uguali = false;
      }
    }
    if(uguali){
      System.out.println("Le due stringhe sono uguali");
    }else{
      System.out.println("Le due stringhe sono diverse");
    }
  }
}
