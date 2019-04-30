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
      for(int i=0;i<l;i++)
      {
        if(str.charAt(i)>='a'&&str.charAt(i)<='z')
        {
          char ch=(char)(str.charAt(i)-'a');
          if(a[ch]!='$'){
          System.out.print(str.charAt(i));
          System.out.print(a[ch]+" ");
            a[ch]='$';
             }
             }
        else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
        {
          char ch=(char)(str.charAt(i)-'A');
            if(a[ch]!='$'){
          System.out.print((char)(ch+'a'));
          System.out.print(a[ch]+" ");
              a[ch]='$';
             }
        }
      }
    
      
    }
}