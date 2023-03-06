import java.util.Scanner;
public class esercizio4{

  public static int potenze(int n, int m, boolean pari){
    int somma = 0;
    int i = 0;

    if(pari){
      for(i=2;i<=n;i+=2)
        somma+=Math.pow(i,m);
    }else{
      for(i=1;i<=n;i+=2)
        somma+=Math.pow(i,m);
    }
    return somma;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println(potenze(8,2,true));
  }
}
