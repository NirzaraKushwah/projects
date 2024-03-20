import java.util.Scanner;
class Aa
{
public static void main(String arg[])
{
 int a[]=new int [5];
int i,max,min;
Scanner sc=new Scanner(System.in);
System.out.println("enter the element of 1D array");
for(i=0;i<a.length;i++)
 a[i]=sc.nextInt();
max=a[0];
for(i=0;i<a.length;i++)
{
 if(a[i]>max)
 max=a[i];
}
System.out.println("maximum no is" +max);

min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("min no"+min);

}
}