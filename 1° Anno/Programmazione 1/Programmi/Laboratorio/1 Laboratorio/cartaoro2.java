import java.util.Scanner;

public class cartaoro2{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double e = input.nextDouble();
    int n = 0;
    boolean exit = false;
    do{
      double x = (double)n/((double)n+1);
      if(x > (1-e) && x <= 1){
        exit = true;
        System.out.println("Il valore di n e' " + n);
      }else{
        n++;
      }

    }while(exit == false);
  }
}
