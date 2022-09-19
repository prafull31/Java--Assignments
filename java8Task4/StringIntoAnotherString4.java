package java8Task4;

	import java.util.Arrays;
	import java.util.List;

	public class StringIntoAnotherString4 {

	public static void main(String[] args) {


	List<String> list = Arrays.asList("Prafull ", "Patil");


	StringBuilder sb = new StringBuilder();
	list.forEach(sb::append);
	
	System.out.println(sb.insert(7, " and"));
	


	System.out.println(sb);
	}


	}
	
