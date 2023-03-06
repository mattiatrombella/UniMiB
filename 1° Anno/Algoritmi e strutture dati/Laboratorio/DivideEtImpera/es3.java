public class es3{
  public static int function(char a[], char k1, char k2, int sx, int dx){
    int m, tot1, tot2, tot;

    if(sx>=dx)
      return 0;
    else{
      m=(sx+dx)/2;
      tot1=function(a,k1,k2,sx,m);
      tot2=function(a,k1,k2,(m+1), dx);
      tot = tot1 + tot2;
      if(a[m] == k1 && a[m+1] == k2)
        tot++;
      if(a[m] == k2 && a[m+1] == k1)
        tot++;
    }
    return tot;
  }

  public static void main(String[] args) {
    char a[] = new char[5];
    a[0] = 'x';
    a[1] = 'y';
    a[2] = 'x';
    a[3] = 'c';
    a[4] = 'y';

    int b = function(a,'x', 'y', 0, 4);
    System.out.println(b);
  }
}
