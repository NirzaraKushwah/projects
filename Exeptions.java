import java.util.Scanner;
class Exeptions
 {
  public static void main(String args[])
  {
   Scanner sc=new Scanner (System.in);
   int index,n,res;
    int a[]={10,20,30,40,50};
   System.out.println("enter the index");
   index=sc.nextInt();
   System.out.println("enter the value of n");
   n= sc.nextInt();
        try{
    res=a[index]/n;
   System.out.println("result="+res);
}
 catch(ArrayIndexOutOfBoundsException e)
{
	  System.out.println("index number is out of index");
	  }
catch(ArithmeticException e)
{
	  System.out.println("arithmatic issue");
	  }
	  }
}