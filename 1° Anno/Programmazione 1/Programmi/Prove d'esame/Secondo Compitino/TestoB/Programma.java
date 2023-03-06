import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    if(args.length!=6){
      System.out.println("Devono essere usati 6 caratteri");
      System.exit(0);
    }
    //creo l'array caratteri
    char caratteri[] = new char[5];
    for(int i=0; i<5; i++){
      caratteri[i] = args[i].charAt(0);

    }
    //salvo l'ultimo carattere in c
    char c = args[5].charAt(0);
    System.out.println(c);

    char copiaCaratteri[] = new char[5];
    // creo l'array copiaCaratteri
    for(int i=0; i<5; i++){
      copiaCaratteri[i] = caratteri[i];
    }
    Metodi.modificaArray(copiaCaratteri, c);
    System.out.println("array caratteri:");
    for(int i=0;i<5;i++){
      System.out.print(" " + caratteri[i]);
    }

    System.out.println();
    System.out.println("array copiaCaratteri");
    for(int i=0;i<5;i++){
      System.out.print(" " + copiaCaratteri[i]);
    }
    System.out.println();
    int n = Metodi.valutaDifferenzeArray(caratteri, copiaCaratteri);

    if(n==-1){
      System.out.println("Errore");
    }else if(n==0){
      for(int i=0; i<5; i++){
        System.out.print(" " + copiaCaratteri[i]);
      }
    }else{
      for(int i=0; i<5; i++){
        System.out.print(" " + caratteri[i]);
      }
    }

  }
}
