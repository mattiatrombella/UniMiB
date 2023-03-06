public class CerchioPrimaVersione{
  public static double areaCerchioRaggio2(){ // ho messo double perchè il metodo restituirà un double, altrimenti dovrei mettere void
    System.out.println("raggio 2");
    return 3.14159 * 2 * 2;    //return è la parola chiave per restituire il valore
  }

  public static void main(String[] args) {
    double area = areaCerchioRaggio2();
    System.out.println("Area del cerchio di raggio 2: " + area);
  }
}
