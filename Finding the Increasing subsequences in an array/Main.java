import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
   sub(a,n);  
  }
  
  public static void sub(int a[],int n)
  {
    
    for(int i=0;i<n-1;i++)
    {
      int b=0;
      for(int j=i+1;j<n;j++)
      {
        if(a[i]<a[j] && a[j]>b)
        {
          b=a[j]; 
          System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
  
}