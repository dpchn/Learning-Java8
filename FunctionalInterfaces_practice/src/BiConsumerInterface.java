import java.util.*;
import java.util.function.*;

public class BiConsumerInterface {

	public static void main(String[] args) {

		List<Candidate> candidates = new ArrayList(
				Arrays.asList(new Candidate("Sen", "CSE", 2, 25), new Candidate("Himanshu", "ECE", 2, 23),
						new Candidate("Prateek", "CSE", 0, 30), new Candidate("Sudhanshu", "EEE", 0, 21),
						new Candidate("Dhasmana", "ME", 0, 18), new Candidate("Summmit", "ME", 1, 20),
						new Candidate("Anshu", "CSE", 6, 20), new Candidate("Anup", "CSE", 8, 32),
						new Candidate("Devendra", "Civil", 0, 17), new Candidate("Rahul", "ECE", 5, 27),
						new Candidate("Diwakar", "EEE", 0, 19), new Candidate("Rupesh", "ME", 30, 60)));

		Predicate<Integer> agePrediacte = x -> x > 20;
		Predicate<Candidate> experiencePrediacte = x -> x.experience == 0;
		Predicate<Candidate> branchPrediacte = x -> x.branch.toUpperCase().trim().equals("CSE");
		Predicate<Integer> yearPrediacte = x -> x == 2017;

		Consumer<List<Candidate>> ageFilter = x -> {
			Iterator<Candidate> candidate = x.iterator();
			while (candidate.hasNext()) {
				if (!agePrediacte.test(candidate.next().age))
					candidate.remove();
			}
		};

		Consumer<List<Candidate>> experineceFilter = x -> {
			Iterator<Candidate> candidate = x.iterator();
			while (candidate.hasNext()) {
				if (!experiencePrediacte.test(candidate.next()))
					candidate.remove();
			}
		};

		Consumer<List<Candidate>> branchFilter = x -> {
			Iterator<Candidate> candidate = x.iterator();
			while (candidate.hasNext()) {
				if (!branchPrediacte.test(candidate.next()))
					candidate.remove();
			}
		};

		BiFunction<Candidate, String, String> jobType = (x, y) -> {
			if (experiencePrediacte.and(branchPrediacte).test(x)) {
				return " Entry Level";
			}
			else if(x.experience<=3)
				return " Software Engineer";
			else if(x.experience >=4 && x.experience<=6)
				return " Senior Software Engineer";
			else if(x.experience>8)
				return " Team Lead";
			return " Manager";
		};

		Consumer<List<Candidate>> printer = x -> {
			Iterator<Candidate> candidate = x.iterator();
			while (candidate.hasNext()) {
				Candidate cand = candidate.next();
				System.out.println("Name :" + cand.name + "  Age :" + cand.age + "  Branch :" + cand.branch
						+ "  Passing Year:" + cand.year + "  Experience:" + cand.experience+" Job Type :"+jobType.apply(cand, cand.name));
			}
		};

		//ageFilter.andThen(branchFilter).andThen(experineceFilter).andThen(printer).accept(candidates);
		
		System.out.println("--------------------------------------------");
		printer.accept(candidates);

	}
}

class Candidate {
	int age;
	String name;
	String branch;
	int year;
	int experience;

	Candidate(String name, String branch, int experince, int age) {
		this.age = age;
		this.name = name;
		this.branch = branch;
	}
}