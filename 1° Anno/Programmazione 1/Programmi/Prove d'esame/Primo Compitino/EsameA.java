import java.util.Scanner;

class EsameA {
   public static void main(String[] args) {
      Scanner tastiera = new Scanner(System.in);

      System.out.println("Inserisci una sequenza di interi positivi, terminata da 0.");
   
      int sum = 0;
      int max = 0;
      int min = -1;
   
      int numeroLetto = -1;
      while (numeroLetto != 0) {
         System.out.print("Inserisci un intero positivo, oppure 0 per terminare: ");
	     numeroLetto = tastiera.nextInt();
         if (numeroLetto < 0)
            System.out.println("Devi inserire un numero maggiore o uguale a 0!");
	     else if (numeroLetto > 0) {
            sum += numeroLetto;
            if (numeroLetto > max)
               max = numeroLetto;
            if (min == -1)
               min = numeroLetto;
            else if (numeroLetto < min)
                    min = numeroLetto;
	     }
      }
	  System.out.println("sum = " + sum + ", min = " + min + ", max = " + max);
	  
	  int somma = 0;
	  int contatore = 0;
	  
	  int i = max;
	  while (i <= sum) {
         int j = min;
         while (j <= max) {
            somma += i*j;
            contatore++;
            j++;
		 }
         i++;
      }

      double media = (double) somma / contatore;
      System.out.println("Il valore della media e': " + media);
   }
}