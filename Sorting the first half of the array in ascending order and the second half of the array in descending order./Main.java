import java.util.Scanner; 
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int m=n/2;
    for(int i=0;i<m-1;i++)
    {
      for(int j=i+1;j<m;j++)
      {
        if(a[i]>=a[j])
        {
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=m;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]<=a[j])
        {
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}