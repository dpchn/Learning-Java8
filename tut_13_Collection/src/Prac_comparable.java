import java.util.*;
public class Prac_comparable {

	public static void main(String args[]) {
		ArrayList<Students> al  = new ArrayList<Students>();
		al.add(new Students(70, "Ujjawal"));
		al.add(new Students(30, "Prakash"));
		al.add(new Students(80, "Anush"));
		al.add(new Students(10, "Prateek"));
		al.add(new Students(50, "Anush"));
		
		Collections.sort(al);
		
		Iterator<Students> it  = al.iterator();
		
		while (it.hasNext()) {
			Students data = (Students) it.next();
			System.out.println(data.name+"  "+data.marks);
			
		}
	}
}


class Students implements Comparable<Students>{
	int marks;
	String name;
	
	public Students(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	
	public int compareTo(Students s1) {
		
		if(marks== s1.marks)
			return 0;
		else if(marks > s1.marks)
			return 1;
		return -1;
	}
}
