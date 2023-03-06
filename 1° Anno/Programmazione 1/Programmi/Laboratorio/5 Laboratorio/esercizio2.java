import java.util.Scanner;
public class esercizio2{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    boolean exit = false, inputValido = true;
    char c = ' ';
    do{
      do{
      System.out.println("a) somma di due numeri interi \nb) divisione intera e resto tra due numeri interi \nc) media tra due numeri double \nd) valore assoluto di un numero intero \ne) lunghezza della stringa che rappresenta un numero intero \nt) termina il programma");
      String s = input.nextLine();
      if(s.length() != 1){
        System.out.println("Input Non Valido");
        inputValido = false;
      }else{
        c = s.charAt(0);
      }
    }while(!inputValido);
    inputValido = true;
      switch(c){
        case 'a':
        case 'A':
          System.out.println("Inserisci due numeri interi");
          int a = input.nextInt();
          int b = input.nextInt();
          System.out.println("La somma dei due interi e' "+ Metodi.sommaDueInteri(a,b));
          break;
        // case 'b':
        // case 'B':
        //   int c = input.nextInt();
        //   int d = input.nextInt();
        //   if(d!=0){
        //     System.out.println(Metodi.divisioneIntera(c,d));
        //     System.out.println(Metodi.restoDivisioneIntera(c,d));
        //   }
        //   break;
        // case 'c':
        // case 'C':
        //   double a = input.nextDouble();
        //   double b = input.nextDouble();
        //   System.out.println(Metodi.mediaTraDueDouble(a,b));
        //   break;
        // case 'd':
        // case 'D':
        //   int e = input.nextInt();
        //   System.out.println(Metodi.valoreAssolutoIntero(e));
        //   break;
        // case 'e':
        // case 'E':
        //   String num = input.next();
        //   System.out.println(Metodi.lunghezzaStringaIntero(num));
        //   break;
        case 't':
        case 'T':
          exit = true;
          break;
      }
    }while(!exit);
  }

}
