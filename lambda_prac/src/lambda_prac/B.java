package lambda_prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class employee 
{
	String name;
	Integer id;
	employee(String name, Integer id)
	{
		this.id = id;
		this.name = name;
	}
}




public class B {

//	public static int compareById(employee o1, employee o2)
//	{
//		return o1.id.compareTo(o2.id);
//	}
	
   public static void main(String args[]) {
	
	   List<employee> employees = new ArrayList<employee>();
	   employees.add(new employee("a",20));
	   employees.add(new employee("f",90));
	   employees.add(new employee("k",40));
	   employees.add(new employee("e",60));
	   employees.add(new employee("w",20));
	   
	   /*Collections.sort(employees, new Comparator<employee>() {
		   @Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}   
	   });*/
	   
	   
	   Collections.sort(employees, B::compareById);
	   
	   for(employee emp:employees)
	   {
		   System.out.println(emp.id+" "+emp.name);
	   }
	   
	   
	   System.out.println("---------------------------------");
	   Collections.sort(employees, (e1,e2)->e1.id.compareTo(e2.id));
	   
	   for(employee emp:employees)
	   {
		   System.out.println(emp.id+" "+emp.name);
	   }
	   
	   /*Anonymous inner = new Anonymous() {
		   public void cal() {
			   System.out.println("Hello");
		   }
		   
		   
	   };
	   inner.cal();*/
}
   
   
}


abstract class Anonymous{
	public abstract void cal() ;
}