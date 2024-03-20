class Jagged
{
 public static void main(String arg[])
{
int i,j;
int a[][]={  {1,2,3},
                  {6,7},
                  {5,4,3},
};
for(i=0;i<a.length;i++)
{
  for(j=0;j<a[i].length;j++)

System.out.print(a[i][j]+ "  ");
System.out.println("   ");
}
 for(  i=0;i<a.length;i++)
{ 
int sum=0;
for(  j=0;j<a[i].length;j++)
 sum+=a[i][j];
System.out.println("sum of row in a matrix"+sum);
}  

int max;
for(i=0;i<a.length;i++)
{ 
max=a[0][0];
 for(j=0;j<a[i].length;j++)
   if(a[i][j]>max)
    max=a[i][j];
System.out.println("  maximum is"+max);
}
 int min;
for(i=0;i<a.length;i++)
 {
    for(j=0;j<a[i].length;j++)
     if(a[i][j]<min)
  min=a[i][j];
System.out.println("minimum is"+min);
}
}
} 