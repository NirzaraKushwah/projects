import java.util.ArrayList;
import java.util.Iterator;
class Col{
    
      int empid;
      String name;
      double sal;

    Col(int empid, String name, double Sal) {
        this.empid = empid;
        this.name = name;
        this.sal = Sal;
    }

    @Override
    public String toString() {
        return name+" "+empid+" "+sal;
    }
      
    public static void main(String[] args) {
         
        Col e1=new Col(101,"ram",12.3);
        Col e2=new Col(102,"avi",13.9);
        Col e3=new Col(104,"adii",1999);
        Col e4=new Col(105,"rudhra",177.7);

        ArrayList al=new ArrayList();
       al.add(e1);
       al.add(e2);
       al.add(e3);
       al.add(e4);
       
       System.out.println(al);
       
        
        Iterator itr=al. iterator();
     while(itr.hasNext())
     {
         System.out.println(itr.next());
     }


    }
    }
