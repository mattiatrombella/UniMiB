public class es2{
  public static int contaK(int a[], int k, int sx, int dx){
    int m, tot1, tot2, tot ;
    if(sx == dx)
      if(a[sx] == k)
        return 1;
      else
        return 0;
    else{
      m=(sx+dx)/2;
      tot1 = contaK(a,k,sx,m);
      tot2 = contaK(a,k,(m+1), dx);
      tot = tot1 + tot2;
    }
    return tot;
  }

  public static void main(String[] args) {
    int a[] = new int[5];

    for(int i = 0;i<a.length;i++){
      a[i] = 5;
    }
    a[2] = 0;
    int b = contaK(a,5,0,4);
    System.out.println(b);
  }
}
