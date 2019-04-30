import java.util.Scanner;
class Main{
public static void prime(int n)
{
  int p=0;
  for(int i=2;i<=n;i++)
  {
    p=0;
    for(int j=1;j<=i;j++)
    {
      if(i%j==0)
        p++;
    }
    if(p<=2)
      System.out.println(i);
  }
  
}
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      prime(a);
	}
}