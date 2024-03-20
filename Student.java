import java.util.Scanner;
class Student
{
public static void main(String arg[])
{
int m1,m2,m3;
int i,j,k;
Scanner sc=new Scanner(System.in);
 int a[][][]=new int [5][5][5];

System.out.println("enter the marks of 1st student");
  for(i=0;i<a.length;i++)
m1=sc.nextInt();
int sum=0;
 for(i=0;i<a.length;i++)
sum+=a[i];
System.out.println("total marks"+sum);


System.out.println("enter the marks of 2nd student");
  for(j=0;j<a[i].length;j++)
m2=sc.nextInt();

System.out.println("enter the marks of 3rd student");
  for(k=0;k<a[i][j].length;k++)
m3=sc.nextInt();

}
}


