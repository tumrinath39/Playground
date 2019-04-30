import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int l=str.length();
      int f=0,e=(l-1);
      boolean t=true;
      while(f<e)
      {
        if(str.charAt(f)!=str.charAt(e))
          
         {t=false;break;}
        f++;e--;
      }
      if(t==true)
        System.out.println("Yes");
      else System.out.println("No");
    } 
}