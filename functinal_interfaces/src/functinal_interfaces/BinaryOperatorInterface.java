package functinal_interfaces;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;

public class BinaryOperatorInterface {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryoperator = BinaryOperator.maxBy(Comparator.naturalOrder());
		System.out.println(binaryoperator.apply(45, 1));
		
		BinaryOperator<Integer> binaryoperator1 = BinaryOperator.minBy(Comparator.naturalOrder());
		System.out.println("Smallest no is "+binaryoperator1.apply(45, 1));
		
		
		Comparator<Integer> comp = (a, b)->a.compareTo(b);
		
		BinaryOperator<Integer>  binop = BinaryOperator.maxBy(comp);
		BinaryOperator<Integer>  binop1 = BinaryOperator.minBy(comp);
		
		System.out.println("Max Value :"+binop.apply(14, 25));
		System.out.println("Min Value :"+binop1.apply(14, 25));
		System.out.println("Max Value :"+binop.apply(4, -10));
		System.out.println("Min Value :"+binop1.apply( 	4, 5));
		
		/*
		 * 
		 */
		
		
		/*List<student> li = Arrays.asList();
		li.add(new student(23, "Rakesh", "B"));
		li.add(new student(13, "Suresh", "A"));
		li.add(new student(18, "Mahesh", "C"));
		li.add(new student(30, "Rakesh", "A"));
		li.add(new student(25, "Adilesh", "B"));
		li.add(new student(35, "Dinesh", "B"));
		li.add(new student(40, "Rakesh", "C"));
		
		Comparator<student> ageComp = Comparator.comparing(student::getAge);
		Map<?, Optional<student>> grt = li.stream().collect(Collectors.groupingBy(student::getClass, Collectors.reducing(BinaryOperator.maxBy(ageComp))));
		grt.forEach((i,j)->System.out.println(i+ " "));*/
	}
}


class student{
	Integer age;
	String name, className;
	student(Integer age, String name, String className){
		this.age = age;
		this.name = name;
		this.className = className;
	}
	
	
	int getAge() {
		return age;
	}
	
	
	String name() {
		return name;
	}
	
	
	String className() {
		return className;
	}
	
}
