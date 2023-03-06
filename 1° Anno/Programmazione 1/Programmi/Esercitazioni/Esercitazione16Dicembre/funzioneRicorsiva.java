import java.util.Scanner;

public class funzioneRicorsiva{
  public static int ric(int n){
    if(n==0) return 3;
    else return (1-2*ric(n-1));
  }

  public static int fibo(int n){
    if(n==0 || n==1) return 1;
    else return fibo(n-1)+fibo(n-2);
  }

  public static int sum(int n){
    if(n==1) return 1;
    else return (sum(n-1)+n);
  }

  public static int esp(int n){
    if(n==1) return 2;
    else return (esp(n-1)*2);
  }

  public static boolean esiste(int a[], int i, int k){
    if(i == a.length-1) return (a[i] == k);
    else return((a[i] == k) || esiste(a, i+1, k));
  }

  public static boolean tuttiZeri(int a[], int i){
    if(i == a.length-1) return (a[i] == 0);
    else return((a[i] == 0) && tuttiZeri(a, i+1));
  }

  public static void main(String[] args) {
    int a[] = new int[10];
    int i;
    for(i=0;i<10;i++)
      a[i] = 0;

    System.out.println(ric(5));
    System.out.println(fibo(5));
    System.out.println(sum(10));
    System.out.println(esp(3));
    System.out.println(tuttiZeri(a, 0));
  }
}
