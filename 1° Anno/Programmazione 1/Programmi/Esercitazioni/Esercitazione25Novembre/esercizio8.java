//Scrivere un programma che stampa, generandole casualmente, 15 sestine
//di numeri compresi tra 1 e 90 in modo che ciascun numero appaia una sola
//volta in solo una delle sestine

import java.util.Scanner;

public class esercizio8{
  public static void main(String[] args) {

    int a[] = new int[91];
    int x=0, n=1;
    for(int i=0; i<a.length; i++)
      a[i] = 0;
      while(n<=90){
         x = (int)(Math.random()*90) + 1;
         if(a[x] == 0){
           a[x] = 1;
           if((n-1)%6==0)
            System.out.print("\nSestina numero " + ((n-1)/6 + 1) + " ");
          System.out.print(x + " ");
          n++;
        }
      }

      System.out.println();

  }
}
