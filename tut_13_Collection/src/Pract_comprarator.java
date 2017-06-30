import java.util.*;
import java.util.Scanner;
public class Pract_comprarator {

	public static void main(String args[]) {
		ArrayList<Employee> al = new ArrayList();
		
		/*
		 * 	System.out.println("Enter Details Here...");
		
		Scanner s1 =new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.println("Enter id :");
			int id = s1.nextInt();

			System.out.println("Enter Name :");
			String name = s1.nextLine();
			al.add(new Employee(id, name));
		}
		
		Collections.sort(al, new IdCompare());
		for(Employee x: al)
			System.out.println(x.id+"  "+x.name);
		 */
		
		
		al.add(new Employee(23, "Harry"));
		al.add(new Employee(20, "Harish"));
		al.add(new Employee(1, "Dharmendra"));
		al.add(new Employee(2, "Kushal"));
		al.add(new Employee(10, "Pushp"));
		al.add(new Employee(23, "Harry"));
		
	
		
		Collections.sort(al, new IdCompare());
		for(Employee x: al)
			System.out.println(x.id+"  "+x.name);
	}
}



class Employee{
	int id;
	String name;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}



class IdCompare implements Comparator{
	
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		if(e1.id== e2.id)
			return 0;
		else if(e1.id> e2.id)
			return 1;
		return  -1;
	}
}
