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
      
      for(int i=0;i<n;i++)
      {
        int c=0;
        for(int j=0;j<n;j++){
        if(a[j]!=i+1)
        {
          c++;
        }
        }
        if(c>=n)
        {
          System.out.print(i+1);
        }
        
      }
    }
}