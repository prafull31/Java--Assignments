 package java8Task2;

import java.util.Arrays;

public class Java8Task2 {

		public static void main(String[] args) {
		String given[] = { "Taj is situated in Agra" };
		String find = "AST";
		boolean anyMatch = Arrays.stream(given).anyMatch(s -> s.contains(find));
		System.out.println(anyMatch);
		if (anyMatch == false) {
		System.out.println(find + " String not found");
		}
		
		System.out.println(find + " String found");


		}

	}
