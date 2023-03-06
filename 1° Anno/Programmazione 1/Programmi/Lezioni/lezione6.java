import java.util.Scanner;

public class lezione6{

  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int n = input.nextInt();

      if(n % 2 == 0){
        System.out.println("Il numero e' pari");
      }else{
        System.out.println("Il numero e' dispari");
      }

// --------------------------------------------------------------- //
      int x = input.nextInt();

      if(x < 0){
        System.out.println("Il numero e' minore di zero");
      }else if(x > 0){
        System.out.println("Il numero e' maggiore di zero");
      }else{
        System.out.println("Il numero e' uguale a zero");
      }

  }
}
