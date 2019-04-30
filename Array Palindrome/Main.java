import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int f=0;
      for(int i=0,j=n-1;i<=j;i++,j--)
      {
        if(a[i]==a[j])
        {
          f=1;
        }
        else
        {
          f=0;
          break;
        }
        if(f==0)
          System.out.print("No");
      }
      if(f==1)
        System.out.print("Yes");
      else System.out.print("No");
    }
}