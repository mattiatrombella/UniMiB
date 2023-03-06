public class es4{
  public static boolean conta(int a[],int sx, int dx){
    int m;
    boolean d, b;
    if(sx>=dx)
      return false;
    else if(sx == dx-1){
      if(a[sx] == 8 && a[dx]==5)
        return true;
      else
        return false;
    }
    else{
      m=(sx+dx)/2;
      d=conta(a,sx,m);
      b=conta(a,m,dx);
      if((!d && b) || (d && !b))
        return true;
      else
        return false;
    }

  }

  public static void main(String[] args) {
    int g[] = new int[6];

    g[0] = 8 ;
    g[1] = 5 ;
    g[2] = 8 ;
    g[3] = 5 ;
    g[4] = 8 ;
    g[5] = 5 ;
    boolean z = conta(g,0,5);
    System.out.println(z);
  }
}
