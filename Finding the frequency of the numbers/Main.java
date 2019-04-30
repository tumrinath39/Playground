import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int b[]=new int[k];
      for(int i=0;i<n;i++)
      {
        b[a[i]-1]++;
      }
      for(int i=0;i<k;i++)
      {
        System.out.println((i+1)+" "+b[i]);
      }
    
    }
}