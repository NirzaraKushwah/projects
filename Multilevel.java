class Multi
{
 void method()
{
 System.out.println("this is a multilevel ");
}
}
interface Fule
{
   void dis();
}
class Toy extends Multi implements Fule
{
   void method()
{
  System.out.println("this is toY");
}
  void dis()
{
 System.out.println("this is fuele class");
}
}
 class Multilevel 
{
 public static void main (String arg[])
{
 Toy t=new Toy();
t.method();
t.dis();
}
}
   