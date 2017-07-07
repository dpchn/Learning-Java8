import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;
public class Grading_System {

	public static void main(String[] args) {
		List<Mark> marks = Arrays.asList(new Mark(52, 14, 20, "Arpit"),
				new Mark(50, 56, 60, "Kushal"),
				new Mark(6, 55, 80, "Ajay"),
				new Mark(80, 70, 70, "Rohit"),
				new Mark(52, 50, 51, "Neha"),
				new Mark(2, 14, 20, "Keerti"),
				new Mark(52, 80, 60, "Abhit")
				);
		Function<Double, String> grade = x->{
			
			if(x>80)
				return "A+";
			else if(x>70)
				return "A";
			else if(x>60)
				return "B+";
			else if(x>50)
				return "B";
			else if(x>35)
				return "C";
			return "Fail";
		};
		
		Consumer<List<Mark>> consumer = x ->{
			Iterator<Mark> student = x.iterator();
			
			while(student.hasNext()) {
				Mark m = student.next();
				double total = ((m.Physics+m.Chemistry+m.Maths)*100)/300;
				System.out.println("Name: "+m.name+"  Physics: "+m.Physics+
						"  Chemistry: "+m.Chemistry+
						"  Maths: "+m.Maths+"  Total Marks: "+total+
						"  Grade: "+grade.apply(total));
			}
		};
		
		consumer.accept(marks);
		
	}
}

class Mark{
	int Physics,Chemistry,Maths;
	String name;
	Mark(int p, int c, int m, String name){
		this.Physics = p;
		this.Chemistry = c;
		this.Maths = m;
		this.name =  name;
	}
}
