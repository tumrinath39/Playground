import java.util.Scanner;
class Main{
  public static int greatest(int a,int b)
  {
    if(a>b)
      return a;
    else return b;
  }


	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int r;
      r=greatest(n1,n2);
      if(r>n3)
        System.out.println(r);
      else System.out.println(n3);
	}
   
}