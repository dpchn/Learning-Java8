package java8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java8.OrganizationExpenditure;

public class LambdaTest {

	private static List<OrganizationExpenditure> createTestData() {
		List<OrganizationExpenditure> expenditures = new ArrayList<>();
		expenditures.add(new OrganizationExpenditure("org1", 10, 20, 31));
		expenditures.add(new OrganizationExpenditure("org2", 11, 19, 32));
		expenditures.add(new OrganizationExpenditure("org3", 12, 18, 33));
		expenditures.add(new OrganizationExpenditure("org4", 13, 17, 34));
		expenditures.add(new OrganizationExpenditure("org5", 14, 16, 35));
		expenditures.add(new OrganizationExpenditure("org5", 14, 16, 35));
		expenditures.add(new OrganizationExpenditure("org6", 15, 14, 36));
		expenditures.add(new OrganizationExpenditure("org6", 15, 14, 36));
		return expenditures;
	}

	public static void main(String[] args) {

		List<OrganizationExpenditure> expenditures = createTestData();
		int sumOfWages = expenditures.stream().distinct().mapToInt(OrganizationExpenditure::getWages).sum();
		
		int maxWage = expenditures.stream().distinct().mapToInt(OrganizationExpenditure::getWages).max().getAsInt();
		int minWage = expenditures.stream().distinct().mapToInt(OrganizationExpenditure::getWages).min().getAsInt();
		Double averageWage = expenditures.stream().distinct().mapToInt(OrganizationExpenditure::getWages).average().getAsDouble();
		List<OrganizationExpenditure> wagesAbove12 = expenditures.stream().distinct().filter(e->e.getWages()>12).collect(Collectors.toList());
		
		
		System.out.println(sumOfWages);
		System.out.println(maxWage);
		System.out.println(minWage);
		System.out.println(averageWage);
		System.out.println(wagesAbove12);
	}

}
