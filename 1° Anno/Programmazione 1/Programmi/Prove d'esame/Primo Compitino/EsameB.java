import java.util.Scanner;

class EsameB {
   public static void main(String[] args) {
      Scanner tastiera = new Scanner(System.in);
	  int n, numeroLetto;

	  n = -1;
	  while (n <= 0) {
         System.out.print("Inserisci un numero intero positivo: ");
         n = tastiera.nextInt();
         if (n <= 0)
            System.out.println("Errore: il numero inserito non e' positivo!");
	  }
	  
	  int prod = 1;
	  int max = 0;
	  int min = 0;
	  
	  numeroLetto = -1;
	  while (numeroLetto != n) {
		 while (numeroLetto <= 0) {
            System.out.print("Inserisci un numero intero positivo, " + n + " per uscire: ");
            numeroLetto = tastiera.nextInt();
            if (numeroLetto <= 0)
               System.out.println("Errore: il numero inserito non e' positivo!");
		 }
		 if (numeroLetto != n) {
            prod *= numeroLetto;
            if (numeroLetto > max)
               max = numeroLetto;
            if (min == 0)
               min = numeroLetto;
            else if (numeroLetto < min)
                    min = numeroLetto;
			numeroLetto = -1;
		 }
	  }
	  System.out.println("prod = " + prod + ", min = " + min + ", max = " + max);
	  
	  int somma = 0;
	  int contatore = 0;

      int i = max;
	  while (i <= prod) {
         int j = min;
         while (j <= max) {
            somma += i+j;
            contatore++;
            j++;
         }
         i++;
      }

      double media = (double) somma / contatore;
      System.out.println("Il valore della media e': " + media);
   }
}