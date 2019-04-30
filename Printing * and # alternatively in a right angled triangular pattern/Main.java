import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int f=0; 
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(f==0){
         System.out.print("*");
            f=1;
        } else {
            System.out.print("#");
          f=0;
          }
        }
        System.out.println("");
      }
    }
}