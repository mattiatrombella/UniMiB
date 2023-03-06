import java.util.Scanner;
public class esercizio2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int m = 0;
    while(m<=0){
      System.out.println("Inserisci un numero positivo");
      m = input.nextInt();
    }
    int contatore=0;
    int a = 2;
    System.out.print(a + ", ");
    while(contatore<m){
      a= 3*a-2;
      if(contatore<m-1)
        System.out.print(a + ", ");
      else
        System.out.println(a);
      contatore++;
    }
  }
}
