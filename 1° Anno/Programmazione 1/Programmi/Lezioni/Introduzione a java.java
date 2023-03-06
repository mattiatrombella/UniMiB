import java.util.Scanner; //import permette di importare codice già presente nel sistema, stiamo importando la classe "Scanner"

public class lezione3{

/*
  per scrivere un commento su più righe
*/
// La classe definisce l’oggetto, dobbiamo sempre definire la classe
//Public --> Modificatore di visibilità, chiunque ha accesso a questo file può modificarlo
  public static void main(String[] args){
      //qua dentro va scritto il programma
      //istruzione di stampa:
      System.out.println("prova");
      //System.out è un oggetto e println è un metodo, print non va a capo, println va a capo

      int n; //stiamo riservando uno spazio di memoria a cui diamo nome "n", posso associare un valore con cui fare operazioni, stamparlo ecc.
      n = 10; //operazione di assegnamento, in questo momento la variabile ha valore 10
      System.out.println(n); //Stampo a video il valore di "n"

      double a; //alla variabile double posso associare numeri razionali Q
      a = 1.5; //ricordarsi che i decimali si scrivono con il punto
      //posso comunque assegnare ad un double un valore intero, è comunque un numero razionale, 3 verrà stampato 3.0
      System.out.println(a*a); //stampo a video il prodotto a*a (2.25)
      //float e double sono diversi, double ha capacità maggiori rispetto a float, può rappresentare numeri molto più grandi o molto più piccoli

      int b = 2; //dichiaro la variabile e la assegno sulla stessa riga per comodità

      Scanner tastiera = new Scanner(System.in); //questo è il comando che ci permette di chiedere un input da tastiera all'utente;
      int numero = tastiera.nextInt(); //legge il contenuto dell'oggetto tastiera e lo associa ad una variabile
      System.out.println(numero); //se però l'utente non inserisce un int il programma andrà in tilt

      byte c = 127; //byte è la variabile più piccola che posso avere, può assumere valori da -128 a 127
      System.out.println(c);

      float f = 4.3f; // è necessario mettere una f alla fine delle cifre decimali per i float
      double d = 4.e2; //sto usando la notazione esponenziale
      System.out.println(d);
      

  }
}
