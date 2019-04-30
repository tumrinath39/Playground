import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int c=0,a=0,r;
      int t=n;
      while(t!=0)
      {
       t=t/10;
        c++;
        
      }
      t=n;
      
      while(t!=0)
      {
       r=t%10;
        int x=r;
        for(int i=1;i<c;i++){
          x=x*r;
          
        }
        a=a+x;
        t=t/10;
      }
      if(a==n)
      System.out.println("Armstrong Number");
      else System.out.println("Not a Armstrong Number");
	}
}