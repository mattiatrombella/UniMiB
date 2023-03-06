import java.util.Scanner;

public class cartaoro1{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci un numero naturale");

    int n = input.nextInt();
    int a = 2;
    for(int i=0;i<=n;i++){

      System.out.print(a + " " );
      a = (3*a) - 2;
    }



  }
}
