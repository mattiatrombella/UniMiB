public class TestVagone{
  public static void main(String[] args) {

    Vagone v1 = new Vagone();
    v1.classe = 2;

    Vagone v2 = new Vagone();
    v2.classe = 2;

    Vagone v3 = new Vagone();
    v3.classe = 1;

    v1.next = v2;
    v2.next = v3;

    Vagone testa = new Vagone();
    testa.classe = 2;
    testa.next = new Vagone();
    testa.next.classe = 2;
    testa.next.next = new Vagone();
    testa.next.next.classe = 1;

    Vagone tmp = testa;
    while(tmp != null){
      System.out.println(tmp.classe);
      tmp = tmp.next;
    }



  }
}
