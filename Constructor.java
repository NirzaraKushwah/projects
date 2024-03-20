class Constructor
{
  int roll;
String name;
 String branch;
Constructor( int roll,String name,String branch)
{
  this.roll=roll;
 this.name=name;
this.branch=branch;
}

void show()
{
System.out.println("student roll no is"+roll);
System.out.println("student name is"+name);
System.out.println("student branch is"+branch);
}
public static void main(String arg[])
{
  Constructor c=new Constructor(101,"nirzara","cs");
  c.show();
}
}
