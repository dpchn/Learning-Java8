package tut_15_Stream;
import java.util.*;
import java.util.stream.Collectors;
import org.omg.CORBA.portable.ValueOutputStream;

public class A {

	public static void main(String args[]) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<Integer> li = Arrays.asList(1,7,0,54,56,48,4,7,-1); 
		
		//Use of forEach
		li.forEach( i->System.out.println(i));
		
		List<Integer> n1 = Arrays.asList(11,2,3,6,5);
		List<Integer> sqr = n1.stream().map(i->i*i).distinct().collect(Collectors.toList());
		//Use of map and distinct method
		
		System.out.println("Square of Number");
		sqr.forEach(System.out::println);
		int count = (int) strings.stream().filter(i->i.isEmpty()).count();
		//Using count method
		System.out.println("No of Empty string is "+count);
		System.out.println(n1.size());
		
		///////////////////////////////////////
		System.out.println("Again Practice of map, filter, count");
		
		List<Integer> lp = li.stream().map(i->i).collect(Collectors.toList());
		System.out.println(lp);
		

		Boolean str = strings.stream().allMatch(i->i.isEmpty());
		

		int [] ar = {45,41,64,65,3,4,5,21,22};
		int sum = li.stream().reduce(0, (a,b)->a+b);
		int sum1 = li.stream().reduce(0, Integer::sum);
		int max = li.stream().reduce(0, Integer::max);
		//int min = li.stream().reduce(li.stream(), Integer::min);
		System.out.println("Sum of all numbers :"+sum);
		System.out.println("Sum using aggregate function :"+sum1);
		System.out.println("Max value in list :"+max);
		//System.out.println("Min  valur in list :"+min);
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		//Us of limit sorted function
		li.stream().limit(3).sorted().forEach(System.out::println);
		
		
		/*
		 * Using parallel stream
		 */
		System.out.println("Now using parallel stream--------------");
		System.out.println("No. of empty string :"+strings.parallelStream().filter(i->i.isEmpty()).count());
		System.out.println("Sum of nos. :"+li.parallelStream().reduce(0, Integer::sum));
		System.out.println(" Total nos. in list :"+li.parallelStream().count());
		
		/*
		 * Use of Collectors to combine result of processing list and it return list or string
		 * One shown above
		 */
		
		System.out.println("Merged list :"+strings.parallelStream().filter(i->!i.isEmpty()).collect(Collectors.joining(",")));
		System.out.println(strings.parallelStream().filter(i->!i.isEmpty()).collect(Collectors.joining(":")));
	}
}
