class Var
{
 void add(int... a)
{
 int count=0, evencount=0, oddcount=0,poscount=0,negcount=0,max=0;

  for(int ele: a)
 { 	 System.out.print(ele + " ");
	count++;
	if(ele % 2 ==0)
		evencount++;
	else
		oddcount++;
                 if(ele<0)
                             poscount++;
                else
                             negcount++;
               if(max < ele)
                             max=ele;
               
                
}
System.out.println(""); 
System.out.println("no of arguments "+count); 
System.out.println("even arguments"+evencount);
System.out.println("odd arguments"+oddcount);
System.out.println("positive arguments"+poscount);
System.out.println("negative arguments"+negcount);

System.out.println("the maximum no is"+max);

}
public  static void main(String args[])
{  
  Var V=new Var();
 V.add(10,2,3,4,5,6,7,8,9);
}
}
