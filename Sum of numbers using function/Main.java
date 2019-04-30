import java.util.Scanner;
class Main
{   public static int sum (int a)
    {	 // Type your code here
  int s=(a*(a+1))/2;
  return s;
	}
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     
      int sq=sum(a);
      System.out.println(sq);
	} 
}