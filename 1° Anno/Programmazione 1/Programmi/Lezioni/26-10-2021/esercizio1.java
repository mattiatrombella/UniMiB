import java.util.Scanner;
public class esercizio1 {
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserire una stringa");
    String parola = tastiera.next();
    int lunghezza = parola.length();

    int i = 0;
    while(i < lunghezza){
      System.out.println(parola.charAt(i) + " "); //stampare singoli caratteri di una stringa
      i++;
    }
    // int contatore, somma = 0;
    // for(contatore = 5; contatore <= 20;contatore ++, somma+=contatore){ //posso anche eseguire così la somma dei numeri da 5 a 20
    //   System.out.println(somma);
    //
    // }

    

  }
}
