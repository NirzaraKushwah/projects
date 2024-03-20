import java.util.Scanner;
class Array2
{
public static void main(String arg[])
{
 int a[] []=new int[4][5];
 int i,j;
 Scanner sc=new Scanner(System.in);
 
System.out.println("enter the elements of 2D array");
for(i=0;i<a.length;i++)
 for(j=0;j<a.length;i++)
a[i][j]=sc.nextInt();
System.out.print("elements of array are");
}
}