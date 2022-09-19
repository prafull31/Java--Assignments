package java8Task9;

import java.util.List;
import java.util.function.Function;

public class QuickSortUsingLambda {
	public static void main(String[] args) {
	}

	public static long countComparisons(List<Integer> a, Function<List<Integer>, Integer> getPivot) {
		if (a.size() <= 1)
			return 0;
		int p = getPivot.apply(a);
		int i = 1;
		for (int j = 1; j < a.size(); j++) {
			if (a.get(j) < p) {
				if (j > i)
					swapInList(a, i, j);
				i++;
			}
		}
		swapInList(a, 0, i - 1);
		return countComparisons(a.subList(0, i - 1), getPivot) + countComparisons(a.subList(i, a.size()), getPivot)
				+ a.size() - 1;

	}

	private static void swapInList(List<Integer> a, int i, int j) {
		// TODO Auto-generated method stub

	}

}
