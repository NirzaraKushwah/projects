@ FunctionalInterface
interface Inter
{
   void show(int a);
}
class Mydemo 
{
 public static void main(String arg[])
{
  Inter i=(a) ->System.out.println("value is"+a);
  i.show(1);
}
}