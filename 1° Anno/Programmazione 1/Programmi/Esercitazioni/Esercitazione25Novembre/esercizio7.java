import java.util.Scanner;

public class esercizio7{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a[] = new double[10];
    //inizializzare con valori casuali

    for(int i = 0; i<a.length;i++)
      a[i] = Math.random();

    // for(int i = 0; i<a.length;i++)
    //   System.out.println(a[i]);

    double norma = 0;

    for(int i = 0; i<a.length;i++)
      norma = norma + a[i]*a[i];

    norma = Math.sqrt(norma);

    System.out.println("La norma euclidea e' " + norma);
  }
}
