import java.util.*;

public class Normal {

	public static void main(String[] args) {
		Student []stu = {new Student(7.8,"cse001","Deepak"),
				new Student(9.8,"cse001","Dsdk"),
				new Student(5.8,"cse000","htrdgpak"),
				new Student(6.8,"cse098","Hhsdak"),
				new Student(9.8,"cse065","Prak")
				,new Student(10.6,"cse010","Sdhaak"),
				new Student(54.5,"cse045","Lkepak")};
		
		Arrays.sort(stu, new StudentCgp());
		System.out.println(Arrays.toString(stu));
		for(Student s: stu)
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCgp());
		
	}
}

class Student {	
	private Double cgp;
	private String id;
	String name;
	
	public Student(Double cgp, String id, String name) {
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
/*	public int compareTo(Student obj) {
		return this.id.compareTo(obj.id);
	}*/
	
	public String toString() {
		return id+" "+name+" "+cgp;

	}	
}

class StudentCgp implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		// TODO Auto-generated method stub
		return obj1.getCgp().compareTo(obj2.getCgp());
	}
	
}
