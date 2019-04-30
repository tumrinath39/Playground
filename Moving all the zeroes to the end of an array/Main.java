import java.util.Scanner;
class Main{
  public static void fun(int[] a,int n)
  {
    int b[]=new int[n];
    int c=0,k=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]!=0)
      {
        b[k]=a[i];
        k++;
      }
      else c++;
      
    }
    for(int i=k;i<n;i++)
    {
      b[i]=0;
    }
    for(int i=0;i<n;i++)
      a[i]=b[i];
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      fun(a,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
}