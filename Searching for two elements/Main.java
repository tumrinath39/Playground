import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      int x=-1,d=-1;
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      int b=sc.nextInt();
      int c=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(a[i]==b)
        {
         x=i; 
        }
        if(a[i]==c)
        {
          d=i;
        }
      }
      System.out.println(x);
      System.out.println(d);
    }
}