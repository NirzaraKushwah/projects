import java .util.Scanner;
 class Result
{
public static void main(String arg[])
{
 int maths,physics ,chemistry;
 Scanner sc=new Scanner(System.in);
System.out.println("enter the marks of maths");
maths=sc.nextInt();
System.out.println("enter the marks of physics");
physics=sc.nextInt();
System.out.println("enter the marks of chemistry");
chemistry=sc.nextInt();
int total;
total=maths+physics+chemistry;
System.out.println("total marks "+total);
float per;
per=(maths+physics+chemistry)*100/300;
System.out.println("per is"+per);
}
}
