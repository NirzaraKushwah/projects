class Number
{
 int a,b;
 Number( int a,int b)
{
 a=a;
b=b;
}
void show()
{
 System.out.println("the value of a is"+a);
System.out.println("the value of b is"+b);
}
public static void main(String args[])
{
    Number n=new Number(55,44);
    n.show();
}
}