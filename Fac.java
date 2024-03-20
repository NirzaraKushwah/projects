class Fac
{
public static void main(String arg[])
{
 int  a , i , fact=1;
try
{
a=Integer.parseInt(arg[0]);

for(i=1; i<=a; i++)
fact=fact*i;
System.out.println("the factorial are "+fact);
}
catch
{
System.out.println("envalid input");
}
}
}