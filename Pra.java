import java.util.Scanner;
class Pra
{
public static void main(String arg[])
{
  Scanner sc= new Scanner(System.in);
   int a,b,ch;
  System.out.println("enter first no");
  a=sc.nextInt();
  System.out.println("enter second no");
  b=sc.nextInt();

  System.out.println("enter your choice  1->ADD 2->SUBTRACT 3->MULTIPLY 4->DIVIDE \n enter your choice:");
ch=sc.nextInt();

if(ch==1)
{
 System.out.println("addition is"+(a+b));
}
else if(ch==2)
{
 System.out.println("subtract is"+(a-b));
}
else if(ch==3)
{
 System.out.println("mul is"+(a*b));
}
else if(ch==4)
{
 System.out.println("divide is"+(a/b));
}
}
}
                                                                               
                                                                               
                                                                               
                                                                               

 