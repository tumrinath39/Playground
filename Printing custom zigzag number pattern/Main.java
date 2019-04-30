import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2==1){
        for(int j=1;j<=n;j++)
        {
          if(j<n)
          System.out.print(i);
          else System.out.print(i+1);
        }
        }
        else{
        for(int j=n;j>0;j--)
        {
          if(j==n)
          System.out.print(i+1);
          else System.out.print(i);
        }
        }
       
           System.out.println("");
      }
	}
}