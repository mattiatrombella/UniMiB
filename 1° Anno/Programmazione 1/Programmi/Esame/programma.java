//Trombella Mattia 879184
import java.util.Scanner;
class programma{
  public static void main(String[] args) {

    //1. Lettura da linea di comando e gestione degli errori
    if(args.length != 3){
      System.out.println("Errore, e' possibile inserire solamente 3 caratteri singoli!!!");
      System.exit(0);
    }
    for(int i=0;i<3;i++){
      if(args[i].length() != 1){
        System.out.println("Errore, devono esseri inseriti 3 caratteri!!!");
        System.exit(0);
      }
    }
    //Assegnazione dei caratteri inseriti dall'utente ad un array di char
    char arrayA[] = new char[3];
    for(int i=0;i<3;i++){
      arrayA[i] = args[i].charAt(0);
    }

    //2. Invocazione del metodo costruisciArray e memorizzazione del risultato in una matrice
    int matrice[][];
    matrice = metodi.costruisciArray(arrayA);

    //Stampa del contenuto di matrice
    System.out.println("Array matrice:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(j==0)
          System.out.print(matrice[i][j]);
        else
          System.out.print("  "+matrice[i][j]);
      }
      System.out.println();
      System.out.println();
    }
    System.out.println();

    //3. Invocazione del metodo trasforma e stampa a video nuovo contenuto matrice
    int nz = 0;
    metodi.trasforma(matrice);
    System.out.println("Array matrice dopo metodo trasforma:");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(j==0)
          System.out.print(matrice[i][j]);
        else
          System.out.print("  "+matrice[i][j]);
        if(matrice[i][j]==1)
          nz++;

      }
      System.out.println();
      System.out.println();
    }
    //5. Calcolo della funzione ricorsiva usando come parametro la somma degli uno presenti nella matrice
    System.out.println("Il risultato della funzione ricorsiva con il numero " + nz + " e' " + metodi.funRic(nz));

  }


}

class metodi{

  public static int[][] costruisciArray(char[] par){
    int [][]Mtr = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(par[i] < par[j]){
          Mtr[i][j] = 1;
        }else{
          Mtr[i][j] = 0;
        }
      }
    }
    return Mtr;
  }

  public static void trasforma(int[][] par){
    int temp0, temp2;
    for(int i=0;i<1;i++){
        temp0 = par[i][0];
        temp2 = par[i][2];

        par[i][0] = temp2;
        par[i][2] = temp0;

    }
  }

  public static int funRic(int n){
    if(n==0){
      return 3;
    }else if(n<0){
      return -3;
    }
    return 2*funRic(n-1)+2;

  }
}
