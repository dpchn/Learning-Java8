package tut_15_Stream;

import java.util.function.BiConsumer;

public class FunctionalInterfaceExamples {

	public void testBiconsumer(BiConsumer biconsumer) {

	}

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> integerComparator = (t1, t2) -> {
			System.out.println("t1 when compared to t2 " + (t1 > t2));
		};

		BiConsumer<Integer, Integer> integerAddition = (t1, t2) -> {
			System.out.println("t1 when added to t2 " + (t1 + t2));
		};

		BiConsumer<Integer, Integer> integerMultiplier = (t1, t2) -> {
			System.out.println("t1 when multiplied with t2 " + (t1 * t2));
		};
		integerComparator.andThen(integerAddition).andThen(integerMultiplier).accept(10, 20);
	}

}
