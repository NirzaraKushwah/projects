class Test9
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Sugar level=");
int l=sc.nextInt();

public String toString()
{
  return "you have a high suGAR";
}
public String toString()
{
  return "you have a low suGAR";
}

try{
CheckSugar.check(l);
}
catch(HighSugar hs)
{
System.out.println(getmessage());
}
catch(LowSugar ls)
{
System.out.println(getmessage());
}
finally
{
System.out.println("Thanks for coming");
}
}
}


