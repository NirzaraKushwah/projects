class Car
{
 void show()
{
System.out.println("this is car");
}
}
class Sportscar extends Car
{
 void display()
{
System.out.println("this is sportscar");
}
}
class Mycar
{
public static void main(String args[])
{
      Sportscar c= new Sportscar();
      c.show();
      c.display();   
}
}