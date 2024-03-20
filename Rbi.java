abstract class Rbi
{
   abstract void m();
 
 void method()
{
System.out.println("this is method");
}
}
class Sbi extends Rbi
{
   void m()
{
System.out.println("this is abstract claass");
}
}
class Bank
{
public static void main(String args[])
{
  Rbi r=new Sbi();
 r.m();
r.method();
}
}