import java.util.Scanner;

public class Metodi{

  public static void modificaArray(char[] par, char c){
    int conta = 0;
    for(int i=0;i<5;i++){
      char temp = par[i];
      if(c == temp){
        conta++;
      }
    }
    if(conta==0){
      for(int i=0;i<5;i+=2){
        par[i] = c;
      }
    }else if(conta<par.length){
      for(int i=1;i<5;i+=2){
        par[i] = c;
      }
    }

  }

  public static int valutaDifferenzeArray(char[] par1, char[] par2){
    boolean contenuto = true;
    if(par1.length == par2.length){
      for(int i=0;i<5;i++){
        char temp1 = par1[i];
        char temp2 = par2[i];
        if(temp1 != temp2){
          contenuto = false;
          return 1;
        }
      }
      if(contenuto)
        return 0;
    }

    return -1;
  }

}
