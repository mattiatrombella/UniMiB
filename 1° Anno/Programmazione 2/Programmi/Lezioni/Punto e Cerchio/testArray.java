public class testArray{
  public static void main(String[] args) {

    int arrayInt[];
    Punto arrayPunto[];

    //creare un array di oggetti:
    //id = new tipo[dimensione]
    arrayInt = new int[3]; //l'array è formato da tutti zeri poichè array di int (primitivo)
    arrayPunto = new Punto[3]; //l'array è formato da tutti null poichè array di Punto (complesso)
    arrayPunto[2] = new Punto();
    arrayPunto[2].x = 1;
    arrayPunto[2].y = 1;

    Punto p2 = new Punto();
    p2.x = 1;
    p2.y = 1;

  }
}
