public class test{
  public static void main(String[] args) {
    Tesi tesi = new Tesi();
    tesi.titolo = "Visualizzatore di spazi";
    Docente docente1 = new Docente();
    docente1.nome = "Rossi";

    Laureando pippo = new Laureando();
    pippo.nome = "Pippo";
    pippo.matricola = 123456;
    pippo.relatore = docente1;

    pippo.correlatore = new Docente();
    pippo.correlatore.nome = "Bianchi";

    Laureando pluto = new Laureando();
    pluto.nome = "Pluto";
    pluto.matricola = 123678;
    pluto.relatore = pippo.relatore;
    pluto.correlatore = pippo.correlatore;

    pluto.correlatore.nome = "Bianchissimo";

    System.out.println(pippo.nome);
    System.out.println(pippo.matricola);
    System.out.println(pippo.relatore.nome);
    System.out.println(pippo.correlatore.nome);
    System.out.println(pippo.tesi);

    System.out.println(pluto.nome);
    System.out.println(pluto.matricola);
    System.out.println(pluto.relatore.nome);
    System.out.println(pluto.correlatore.nome);
    System.out.println(pluto.tesi);

    Docente docente2 = new Docente();
    docente2.nome = pippo.correlatore.nome;
    pluto.correlatore = docente2;

    pluto.correlatore.nome = "Trombella";

    System.out.println(pippo.nome);
    System.out.println(pippo.matricola);
    System.out.println(pippo.relatore.nome);
    System.out.println(pippo.correlatore.nome);
    System.out.println(pippo.tesi);

    System.out.println(pluto.nome);
    System.out.println(pluto.matricola);
    System.out.println(pluto.relatore.nome);
    System.out.println(pluto.correlatore.nome);
    System.out.println(pluto.tesi);

  }
}
