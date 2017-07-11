import java.util.*;

public class Anonymous {

	public static void main(String[] args) {
		Studentsss []stu = {new Studentsss(7.8,"cse001","Deepak"),
				new Studentsss(9.8,"cse001","Dsdk"),
				new Studentsss(5.8,"cse000","htrdgpak"),
				new Studentsss(6.8,"cse098","Hhsdak"),
				new Studentsss(9.8,"cse065","Prak")
				,new Studentsss(10.6,"cse010","Sdhaak"),
				new Studentsss(54.5,"cse045","Lkepak")};
		
		Arrays.sort(stu, new Comparator<Studentsss>() {

			@Override
			public int compare(Studentsss o1, Studentsss o2) {
				// TODO Auto-generated method stub
				return o1.getCgp().compareTo(o2.getCgp());
			}
		});
		System.out.println(Arrays.toString(stu));
		for(Studentsss s: stu)
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCgp());
		
	}
}

class Studentsss {	
	private Double cgp;
	private String id;
	String name;
	
	public Studentsss(Double cgp, String id, String name) {
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
/*	public int compareTo(Studentsss obj) {
		return this.id.compareTo(obj.id);
	}*/
	
	public String toString() {
		return id+" "+name+" "+cgp;

	}	
}

/*class StudentsssCgp implements Comparator<Studentsss>{

	@Override
	public int compare(Studentsss obj1, Studentsss obj2) {
		// TODO Auto-generated method stub
		return obj1.getCgp().compareTo(obj2.getCgp());
	}
	
}*/
