import java.util.Scanner;

public class testoa{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire un numero positivo o uguale a zero");
    int n = input.nextInt();
    int sum = 0, max = n, min = n;
    while(n!=0){
      if(n>0){
        sum+=n;

        if(n>max)
          max = n;

        if(n<min)
          min = n;

      }
      if(n<0)
        System.out.println("Il numero non può essere negativo");

      n = input.nextInt();

    }
    System.out.println("La somma e' " +  sum + ", il max e' " + max + " e il min e' " +  min);


    double contatore=0;
    double i=max, media, sum2 = 0;
    while(i<=sum){
      double j=min;
      while(j<=max){
        sum2 += (i*j);
        contatore++;
        j++;
      }
      i++;

    }
    media = sum2/contatore;
    System.out.println("Il risultato della media e' " +  media);
  }
}
