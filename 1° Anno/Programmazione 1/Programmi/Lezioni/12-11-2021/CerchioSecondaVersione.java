public class CerchioSecondaVersione{
  public static double areaCerchioRaggio2(){ // ho messo double perchè il metodo restituirà un double, altrimenti dovrei mettere void
    System.out.println("raggio 2");
    double risultato = 3.14159 * 2 * 2;  // la variabile è locale, difatti è visibile solamente all'interno del metodo
    return risultato;    //return è la parola chiave per restituire il valore
  }

  public static void main(String[] args) {
    double risultato = areaCerchioRaggio2();
    System.out.println("Area del cerchio di raggio 2: " + risultato);

  }
}
