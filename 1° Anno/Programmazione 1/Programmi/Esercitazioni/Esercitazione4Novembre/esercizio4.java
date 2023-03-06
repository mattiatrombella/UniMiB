import java.util.Scanner;

public class esercizio4{
  public static void main(String[] args) {

    Scanner tastiera = new Scanner(System.in);


  String s1, s2;
  int confronto;



  System.out.println("Inserisci due stringhe");

  s1 = tastiera.next();
  s2 = tastiera.next();


  int pos=0;
  confronto=0;
  while (pos< s1.length() && pos< s2.length() && confronto==0){

   confronto = s1.charAt(pos) - s2.charAt(pos);

   pos++;

  }

    if (confronto==0)
  if (s1.length() == s2.length())
      System.out.println("stringhe uguali!");
  else
    if (s1.length() < s2.length())
      System.out.println(s1 + "  viene prima di   " + s2);
    else
      System.out.println(s1 + "  viene dopo    " + s2);
  else
  if (confronto <0)
    System.out.println(s1 + "  viene prima di   " + s2);
  else
    System.out.println(s1 + "  viene dopo   " + s2);
  }
}
