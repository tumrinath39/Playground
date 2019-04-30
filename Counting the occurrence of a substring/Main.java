import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int m=str1.length();
      int n=str2.length();
      int c=0;
      
      for(int i=0;i<(m-n+1);i++)
      {
        boolean t=true;
        for(int j=0;j<n;j++){
        if(str1.charAt(i+j)!=str2.charAt(j))
          {
          t=false;
          break;}
          
        }
        if(t==true)
        c++;
      

        
      }
      
        System.out.println(c);
      
    } 
}