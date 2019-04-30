import java.util.Scanner;
class Main{
  public static int gcd(int a,int b)
  {
    int min,gcd=0;
    if(a>b)
      min=a;
    else min=b;
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }


	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int r,s;
      r=gcd(n1,n2);
      s=gcd(r,n3);
      
      System.out.println(s);
      
	}
   
}