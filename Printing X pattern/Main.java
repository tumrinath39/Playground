import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
       for(int j=n;j>0;j--)
       {
         if(i+j==n+1)
         {
           System.out.print("*");
         }
         else if(i==j)
         {
           System.out.print("*");
         }
         else System.out.print(" ");
       }
        
       
           System.out.println("");
      }
	}
}