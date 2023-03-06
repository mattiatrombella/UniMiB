// 1. Dbbiamo scrivere il nostro codice con l'editor di testo (Atom in questo caso)
// 2. Compilare il programma da prompt: javac nomeProgramma.java
// 3. Eseguire il programma da prompt: java nomeProgramma

import java.util.Scanner;

public class esercitazione1{
  public static void main(String[] args){


    //es.1 calcolare area di un rettangolo di base 3 e altezza 7

    int b = 3;
    int h = 7;
    int area = 3 * 7;
    System.out.println("L'area del rettangolo di base 3 e altezza 7 e': " + area);

    //es.2 Calcolare area di un trapezio date le basi e l'altezza
    Scanner input = new Scanner(System.in);
    int b1 = input.nextInt();
    int b2 = input.nextInt();
    int h1 = input.nextInt();
    double areaTrapezio = (b1 + b2) * h1 / 2.0;
    System.out.println("L'area del trapezio e' " + areaTrapezio);

    //es.3 fare la media di tre valori inseriti in input dall'utente
    System.out.println("Inserisci tre valori separati da spazio");

    int v1 = input.nextInt();
    int v2 = input.nextInt();
    int v3 = input.nextInt();

    double media = (v1 + v2 + v3) / 3.0;
    System.out.println("La media dei tre valori e' " + media);


  }
}
