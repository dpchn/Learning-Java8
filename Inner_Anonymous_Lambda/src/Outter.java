import java.util.*;



class Students implements Comparable<Students>{

	private String id;
	private Double cgp;
	private String name;
	
	public Students(Double cgp, String name, String id) {
		// TODO Auto-generated constructor stub
		this.cgp = cgp;
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public Double getCgp() {
		return cgp;
	}
	
    public int compareTo(Students that) {
        return this.id.compareTo(that.id);
    }
	
//	@Override

	
	  static class StudentsCgp implements Comparator<Students>{	
		public int compare(Students obj1, Students obj2) {
			return obj1.getCgp().compareTo(obj2.getCgp());
		}


		
	}
}


public class Outter {

	public static void main(String[] args) {
		Students []stu = {new Students(7.8,"cse001","Deepak"),
				new Students(9.8,"cse001","Dsdk"),
				new Students(5.8,"cse000","htrdgpak"),
				new Students(6.8,"cse098","Hhsdak"),
				new Students(9.8,"cse065","Prak")
				,new Students(10.6,"cse010","Sdhaak"),
				new Students(54.5,"cse045","Lkepak")};
		
		Arrays.sort(stu, new Students.StudentsCgp());
		
		for(Students s: stu){
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCgp());
		}
	}
}
