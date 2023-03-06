import java.util.Scanner;

public class testob{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire un numero positivo");
    int n = input.nextInt();
    while(n<=0){
      System.out.println("Errore, va inserito un numero positivo");
      n = input.nextInt();
    }

    System.out.println("Inserire lo stesso numero precedente");
    int prod = 1, max = 0, min = -1, contatore = 0;
    int a = input.nextInt();
    while(a!=n){
      if(a<=0){
        System.out.println("Inserire un numero positivo");
      }else{
        prod*=a;
        if(a>max)
          max=a;
        if(a<min)
          min=a;
        else if(min == -1)
          min = a;
      }
      a = input.nextInt();
      contatore++;
    }
    if(contatore==0)
      prod = 0;


    System.out.println("prod = " + prod + " max = " + max + " min = " + min);

    double i=max, j, media, somma=0, cont=0;

    while(i<=prod){
      j=min;
      while(j<=max){
        somma+= (i+j);
        cont++;
        j++;
      }
      i++;
    }
    media = somma/cont;
    System.out.println("La media e' " + media);


  }
}
