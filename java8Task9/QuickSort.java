package java8Task9;

import java.util.List;

public class QuickSort {
	    public static long countComparisons(List<Integer> a) {
	        if (a.size() <= 1) return 0;
	        int p = getPivot(a);
	        int i = 1;
	        for (int j = 1; j < a.size(); j++) {
	             if (a.get(j) < p) {
	                 if (j > i) swapInList(a, i, j);
	                 i++;
	             }
	        }
	        swapInList(a, 0, i - 1);
	        return countComparisons(a.subList(0, i - 1)) +
	                countComparisons(a.subList(i, a.size())) + a.size() - 1;
	    }
	 
	    private static Integer getPivot(List<Integer> a) {
	        return a.get(0);
	    }
	 
	    private static void swapInList(List<Integer> a, int i, int j) {
	        int temp = a.get(j);
	        a.set(j, a.get(i));
	        a.set(i, temp);
	    }
	}