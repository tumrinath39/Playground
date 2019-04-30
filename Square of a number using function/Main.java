import java.util.Scanner;
class Main
{   public static int square (int num)
    {
	 // Type your code here
  int s=num*num;
  return s;
	}
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int sq=square(num);
      System.out.println(sq);
	} 
}