import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Lambda {

	public static void main(String[] args) {
		List<Employee> stu = Arrays.asList(new Employee(7.8,"cse001","Deepak"),
				new Employee(9.8,"cse001","Dsdk"),
				new Employee(5.8,"cse000","htrdgpak"),
				new Employee(6.8,"cse098","Hhsdak"),
				new Employee(9.8,"cse065","Prak")
				,new Employee(10.6,"cse010","Sdhaak"),
				new Employee(54.5,"cse045","Lkepak"));
		

		stu.sort((Employee e1, Employee e2)->e1.getCgp().compareTo(e2.getCgp()));
		for(Employee s: stu)
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCgp());
		
	}
	
	
	static class Employee {	
		private Double cgp;
		private String id;
		String name;
		
		public Employee(Double cgp, String id, String name) {
			this.cgp = cgp;
			this.name = name;
			this.id = id;
		}
		
		public Double getCgp() {
			return cgp;
		}
		
		public String getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		@Override
	/*	public int compareTo(Employee obj) {
			return this.id.compareTo(obj.id);
		}*/
		
		public String toString() {
			return id+" "+name+" "+cgp;

		}	
	}

}



/*class EmployeeCgp implements Comparator<Employee>{

	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub
		return obj1.getCgp().compareTo(obj2.getCgp());
	}
	
}*/
