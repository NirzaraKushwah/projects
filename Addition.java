class Addition
{
 void method(int a,int b)
 {
 System.out.println("sum="+(a+b));
}
 void method(int a,int b,int c)
{
 System.out.println("sum ="+(a+b));
}
 public static void main(String args[])
{
  Addition A=new Addition();
 A.method(10,20);
 A.method(10,20,30);
}
}