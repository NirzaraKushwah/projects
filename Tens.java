class In
{
 void main()
{
System.out.println("this is main");
}
}
class Out extends In
{
  void show()
{
System.out.println("this is show class");
}
}
class Mm extends Out
{
 void display()
{
 System.out.println("this is display class");
}
}
class  Tens
{
public static void main(String args[])
{
   Mm n =new Mm();
  n.main();
n.show();
n.display();
}
}