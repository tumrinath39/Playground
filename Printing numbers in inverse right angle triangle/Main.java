import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=n;
      for(int i=1;i<=n;i++)
      { t=n-i+1;
       int num=t;
        for(int j=1;j<=t;j++)
        {
          
          System.out.print(num);
            num--;
        }
        
        
        System.out.println("");
      }
	}
}