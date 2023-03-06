import java.util.Scanner;

class EsameC {
   public static void main(String[] args) {
      Scanner tastiera = new Scanner(System.in);
      int i;

      System.out.print("Inserisci una stringa formata da lettere minuscole: ");
	  String stringa = tastiera.nextLine();

      boolean stringaValida = true;
      i = 0;
      while (stringaValida && i < stringa.length()) {
         if (stringa.charAt(i) < 'a' || stringa.charAt(i) > 'z')
            stringaValida = false;
         i++;
      }
      if (!stringaValida) {
         System.out.println("Errore: la stringa inserita non e' valida!");
         System.exit(-1);
      }
      
      int numVocali = 0;
      i = 0;
      while (i < stringa.length()) {
         switch (stringa.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': numVocali++;
         }
         i++;
      }      
      System.out.println("La stringa contiene " + numVocali + " vocali.");

      String nuovaStringa = "";
      i = 0;
      while (i < stringa.length()) {
         switch (stringa.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': nuovaStringa += stringa.charAt(i);
                      break;
            default: nuovaStringa += (char) (stringa.charAt(i) - 'a' + 'A');
         }
         i++;
      }
      System.out.println("La nuova stringa e': " + nuovaStringa);
      
      int somma = 0;
      i = 0;
      while (i < stringa.length()) {
         somma += stringa.charAt(i);
         i++;
      }
      System.out.println("La somma dei codici Unicode e': " + somma);
      
      double media = (double) somma / stringa.length();
      System.out.println("La media dei codici Unicode e': " + media);      
   }
}