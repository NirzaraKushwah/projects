class Nptel extends Thread
{

 public void run()
{
 System.out.println("thread is running now");
}
 public static void main(String arg[])
{

 Nptel t= new ThreadExtended();
t.start();
}
}