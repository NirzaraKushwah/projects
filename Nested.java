class Outer
{     int a=10;
      void main()
{

System.out.println("the value of a"+a);

     
}
      class Inner
     { 
       int b=20;
       void show()
{
System.out.println("the value of b is"+b);
System.out.println("the value of a is"+a);
     }
}
}
class Nested
{   
   public static void main(String arg[])
{
     Outer out=new Outer();
     Outer.Inner i=out.new Inner();
      out.main();
      i.show();
}
}