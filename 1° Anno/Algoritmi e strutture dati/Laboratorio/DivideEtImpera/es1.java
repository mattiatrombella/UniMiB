public class es1{
  public static int cont10(int a[], int sx, int dx){
    int tot1, tot2, tot, m;
    if(sx == dx)
      return 0;
    if(dx - sx == 1)
      if(a[sx] == 1 && a[dx] == 0)
        return 1;
      else
        return 0;
    else{
      m = (sx+dx)/2;
      tot1 = cont10(a,sx,m);
      tot2 = cont10(a,(m+1), dx);
      tot = tot1 + tot2;
      if(a[m] == 1 && a[m+1] ==0)
        tot++;
    }
    return tot;
  }

  public static void main(String[] args) {
    int a[] = new int[5];
    a[0] = 0;
    a[1] = 1;
    a[2] = 0;
    a[3] = 1;
    a[4] = 0;

    int b = cont10(a,0,4);
    System.out.println(b);
  }
}
