class Nptel extends Thread
{
 public static void main(String arg[])
{
 Nptel run = new Nptel();
	   Thread t = new Thread(run);
	   t.start();

  
}
 void run();
}