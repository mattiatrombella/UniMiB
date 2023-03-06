import java.util.Scanner;
public class esercizio1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci il mese");
    int mese = input.nextInt();
    System.out.println("Inserisci l'anno");
    int anno = input.nextInt();

    if((mese<1 || mese>12) && (anno<1900 || anno>2099)){
      System.out.println("Il mese deve essere compreso tra 1 e 12 e l'anno deve essere compreso tra 1900 e 2099");
      System.exit(0);
    }

    if(mese<1 || mese>12){
      System.out.println("Il mese deve essere compreso tra 1 e 12");
      System.exit(0);
    }

    if(anno<1900 || anno>2099){
      System.out.println("Inserire anno compreso tra 1900 e 2099");
      System.exit(0);
    }

    switch(mese){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Il mese inserito ha 31 giorni nel " + anno);
      break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Il mese inserito ha 30 giorni nel " + anno);
      break;
      case 2:
        if((anno%4==0 && anno%100!=0) || (anno%4==0 && anno%100==0 && anno%400==0))
          System.out.println("Il mese inserito ha 29 giorni nel " +  anno);
        else
          System.out.println("Il mese inserito ha 28 giorni nel " + anno);
      break;
    }

  }
}
