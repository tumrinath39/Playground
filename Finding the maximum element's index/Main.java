import java.util.Scanner;
class Main
{
  public static int max(int n,int a[])
  {
    int m=a[0],s=0;
    
    for(int i=0;i<n;i++)
    {
      if(a[i]>m)
      {
        m=a[i];
        s=i;
      }
    }
    return s;
  }
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int t=max(n,a);
    System.out.println(t);
  }
}