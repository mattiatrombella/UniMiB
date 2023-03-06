import java.util.Scanner;

public class testoc{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci una stringa di caratteri minuscoli");
    String stringa = input.next();
    boolean giusto = true;


        int i = 0;
        while(i<stringa.length()){
          if(stringa.charAt(i) < 'a' || stringa.charAt(i) > 'z')
            giusto = false;
          i++;
        }
        if(!giusto){
          System.out.println("La stringa contiene caratteri maiuscoli");
          System.exit(0);
        }


        int vocali=0;

        int j=0;

        while(j<stringa.length()){
          char c = stringa.charAt(j);
          switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              vocali++;

          }
          j++;
        }

        System.out.println("Ci sono " + vocali + " vocali nella stringa inserita");

        int y = 0;
        String nuovaStringa = "";
        int sommaUnicode = 0;

        while(y<stringa.length()){
          switch(stringa.charAt(y)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              nuovaStringa += stringa.charAt(y);
              break;
            default:
              nuovaStringa += (char)(stringa.charAt(y) - 'a' + 'A');
              break;
          }
          sommaUnicode += (int) stringa.charAt(y);
          y++;
        }
        double mediaUnicode = (double)sommaUnicode/stringa.length();
        System.out.println("La somma dei caratteri UNICODE della stringa inserita e' " + sommaUnicode);
        System.out.println("La stringa con consonanti maiuscole: " + nuovaStringa);
        System.out.println("La media dei caratteri UNICODE della stringa e' "+ mediaUnicode);








  }
}
