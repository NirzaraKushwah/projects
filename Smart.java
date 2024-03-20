class Basic
{
 void call()
{
  System.out.println("calling.....");
}
  void sms()
{
 System.out.println("message....");
}
 void alram()
{
System.out.println("alram");
}
}
class Smart extends Basic
{
   void voice()
{
 System.out.println("recording voice");
}
    void camera()
{
    System.out.println("cllick photos");
}
class Main
{
public static void main(String args[])
{
     Smart s=new Smart();
     s.call();
     s.sms();
      s.alram();
     s.voice();
      s.camera();
}
}
}
 