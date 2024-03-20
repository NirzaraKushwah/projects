class Test12
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Sugar level=");
int l=sc.nextInt();

String s="you have a highsugar";
String s1="you have a lowsugar";
try{
CheckSugar.check(l);
}
catch(HighSugar hs)
{
System.out.println(s.getmessage());
}
catch(LowSugar ls)
{
System.out.println(s1.getmessage());
}
finally
{
System.out.println("Thanks for coming");
}
}
}



