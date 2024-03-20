class Auto
{
 void show()
{
 System.out.println("the automobile have a several machines");
}
}
interface fuel
{
 void fuleuse();
}
interface type
{
 void dis();
}
class Car extends Auto implements fuel,type
{
  void reverse()
{
 System.out.println("car have special feature which is reverse");
}
 public  void fuleuse()
{
 System.out.println("car use a fuel system");
}
  public void dis()
{
 System .out.println("car name is scarpio");
}
}
 class Automobile
{

public static void main(String arg[])
{
 Car c=new Car();
 c.reverse();
c.fuleuse();
c.dis();
c.show();
}
}