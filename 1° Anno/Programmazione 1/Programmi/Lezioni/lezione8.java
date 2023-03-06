import java.util.Scanner;

public class lezione8{
  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);


    int variabile = tastiera.nextInt();
    double distanza;

    switch(variabile){
      case 1:
        distanza = 42.2;
        break;
      case 2:
        distanza = 21.1;
        break;
      case 3:
        distanza = 10.0;
        break;
      default:  //se la variabile non rientra in nessun caso, verrà eseguito ciò che sta nel "default"
        distanza = 5.0;
    }
    System.out.println(distanza);



    System.exit(0); // permette di uscire dal programma e non eseguire ciò che sta scritto dopo
  }
}
