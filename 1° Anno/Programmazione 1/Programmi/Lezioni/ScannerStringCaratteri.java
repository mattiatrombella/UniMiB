import java.util.Scanner;

public class lezione5{

  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in); // crea unn oggetto della classe Scanner

    String parola = "ciao"; //la classe string si usa come una primitiva, per le stringhe utilizziamo il doppio apice

    char carattere = 'c'; //per i char dobbiamo utilizzare l'apice singolo

    System.out.println(parola); //posso stampare la stringa

    parola = "ciao" + " come stai?" + 45; //posso concatenare sia stringhe che numeri, il numero viene fatto diventare stringa

    //i caratteri della stringa sono numerati partendo dallo zero per il primo carattere

    char c = parola.charAt(2); //restituisce il carattere in posizione 2 della stringa
    int n = parola.length(); //restituisce un numero che quantifica quanti caratteri ha la stringa

    System.out.println(" \"Anna è un bel nome \" \n \t ") //per stampare l'apice devo mettere davanti "\", per andare a capo metto \n, per aggiungere un carattere di tabulazione metto \t

    String nome = "Pluto";
    String cognome = "Rossi";

    String sottostringa = nome.substring(2,4); //sto assegnando la sottostringa di caratteri compresi tra quelli messi tra parentesi, includendo il primo ed escludendo il secondo
    String sottostringa2 = nome.substring(3); //assegno la sottostringa di caratteri successivi a quello messo tra parentesi, compreso

    String lowercase = nome.toLowerCase(); //restituisce la stringa con tutti i caratteri messi minuscoli
    String uppercase = nome.toUpperCase(); //restituisce la stringa con tutti i caratteri messi maiuscoli

    Boolean b = nome.equals(parola); //il metodo equals confronta le due stringhe e se sono uguali restituisce vero, altrimenti falso
    Boolean c = nome.equalsIgnoreCase(parola); //uguale al metodo equals ma non differenzia maiuscole e minuscole

    int d = nome.indexOf("pp"); //restituisce la posizione dove inizia ad essere presente la stringa tra parentesi, se la sottostringa non è presente nella stringa, mi restituirà -1
    int e = nome.lastIndexOf("pp"); //restituisce la posizione dell'ultima sottostringa presente

    String input = tastiera.next(); //per leggere stringa da tastiera
    String linea = tastiera.nextLine(); //viene letto tutto quello che c'è nella riga

    parola = nome.replace("na", "ce"); //tutte le volte che trova na lo sostituisce in ce e il risultato lo mette assegna a parola

  }
}
