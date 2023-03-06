import java.util.Scanner;
public class esercizio5{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a[] = new int[10];

    System.out.println(a.length);

    for(int i = 0; i<a.length; i++)
      a[i] = input.nextInt();

    for(int i = 0; i<a.length - 1; i++)
      System.out.print(a[i] + ",");

    System.out.println(a[a.length - 1]);

    //calcolo la somma dei numeri pari contenuti in abstract

    int somma = 0;

    for(int i = 0; i<a.length; i++)
      if(a[i]%2 == 0)
        somma += a[i];

    System.out.println("La somma dei numeri pari contenuti nell'array e' " + somma);

  }
}
