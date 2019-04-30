import java.util.Scanner;
class Main{

public static int power(int a,int b)
{int p=1;
  for(int i=1;i<=b;i++)
  p=p*a;
 return p;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
  int b=sc.nextInt();
  int s=power(a,b);
  System.out.println(s);
}
} 