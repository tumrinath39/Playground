import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int a[]=new int[26];
      int l=str.length();
      for(int i=0;i<26;i++)
      {
        a[i]=0;
      }
      for(int i=0;i<l;i++)
      {
        if(str.charAt(i)>='a'&&str.charAt(i)<='z')
        {
          char ch=(char)(str.charAt(i)-'a');
          a[ch]++;
        }
        else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
        {
          char ch=(char)(str.charAt(i)-'A');
          a[ch]++;
        }
        
      }
      
      for(int i=0;i<26;i++)
      {
        if(a[i]==0)
        {
          char ch=(char)(i+'a');
          System.out.print(ch);
          System.out.print(" ");
        }
      }
    }
}