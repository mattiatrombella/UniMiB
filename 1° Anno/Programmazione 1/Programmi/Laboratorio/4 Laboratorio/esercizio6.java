import java.util.Scanner;

public class esercizio6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Inserisci il genoma");
    String genoma = input.next();
    int i = 0;
    boolean corretto = true;
    while(i<genoma.length()){
      switch(genoma.charAt(i)){
        case 'A':
        case 'C':
        case 'G':
        case 'T':
          i++;
          break;
        default:
          corretto = false;
          System.out.println("Basi azotate inserite errate");
          System.exit(0);
      }
    }

    System.out.println("Inserisci la proteina");
    String proteina = input.next();
    int y = 0;
    corretto = true;
    while(y<proteina.length()){
      switch(proteina.charAt(y)){
        case 'A':
        case 'C':
        case 'G':
        case 'T':
          y++;
          break;
        default:
          corretto = false;
          System.out.println("Basi azotate inserite errate per la proteina");
          System.exit(0);
      }
    }

    if(proteina.length() > genoma.length()){
      System.out.println("Proteina più lunga del genoma, non ci sono occorrenze");
      System.exit(0);
    }

    System.out.print("La sequenza " + proteina + " compare in " + genoma + " nelle seguenti posizioni: ");
    int j = 0;
    int k = 0;
    boolean contenuto = true;
    boolean primaPosizione = true;
    while(j<genoma.length() - 2){
      k=0;
      int h = j;
      while(k<proteina.length()){

          if(proteina.charAt(k) == genoma.charAt(h)){

              contenuto = true;
          }
          else{

            contenuto = false;
            break;
          }
          k++;
          h++;
      }
      if(contenuto){
        if(!primaPosizione){
          int pos = j;
          pos++;
          System.out.print(", " + pos);
        }
        else{
          int pos = j;
          pos++;
          System.out.print(pos);
          primaPosizione = false;
        }
      }else
        contenuto = true;
      j++;
    }


  }
}
