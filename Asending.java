import java.util.Scanner;
class Asending
{
public static void main(String args[])
{
  int i,j,temp;
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
   System.out.println("enter the array elements are");
   for( i=0;i<=5;i++)
{
  a[i]=sc.nextInt();
}
for(i=0;i<=5;i++)
{
  for(j=0;j<=5;j++)
{
  if(a[i]>a[j])
{
  temp=a[i]; 
  a[i]=a[j];
  a[j]=temp;
}
}
}
for(i=0;i<5;i++)
{
System.out.println("asending order"+a[i]);
}
}
}