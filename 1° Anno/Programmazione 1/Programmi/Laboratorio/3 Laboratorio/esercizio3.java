import java.util.Scanner;

public class esercizio3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int teoria = input.nextInt();
    int pratica = input.nextInt();

    int risultato = teoria + pratica;

    if(teoria<1 && risultato>=18){
      System.out.println("Bocciato, studia di più la teoria");
    }else if(teoria<1 && risultato < 18){
      System.out.println("Bocciato, studia di più teoria e pratica");
    }else if(teoria>0 && risultato<18){
      System.out.println("Bocciato, studia di più la pratica");
    }else if(risultato>30){
      System.out.println("Congratulazioni, 30 e lode!");
    }else{
      System.out.println("Il tuo voto e' " + risultato);
    }
    
  }
}
