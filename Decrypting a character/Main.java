import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int key=sc.nextInt();
      if(ch>='a'&&ch<='z')
      {
        char f=(char)(ch-'a');
        f=(char)((f-key+26)%26);
        ch=(char)('a'+f);
      }
      else if(ch>='A'&&ch<='Z')
      {
        char f=(char)(ch-'A');
        f=(char)((f-key+26)%26);
        ch=(char)('A'+f);
      }
      System.out.print(ch);
    }
}