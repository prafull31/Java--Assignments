package StreamApiTask2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPICityTask {

	public static void main(String[] args) {
		
		List<CityStream> cs=Arrays.asList(
				new CityStream(1, "pune", new StateStream(101, "maharashtra"), 6.5f, 500000, 493),
				new CityStream(2, "palam", new StateStream(101, "maharashtra"), 5.0f, 400000, 393),
				new CityStream(3, "lonavala", new StateStream(102, "maharashtra"), 4.8f, 350000, 450),
				new CityStream(4, "aurangabad", new StateStream(102, "maharashtra"), 8.0f, 650000, 350),
				new CityStream(5, "Beed", new StateStream(103, "Maharashtra"), 6.0f, 450000, 500),
				new CityStream(6, "nanded", new StateStream(103, "maharashtra"), 8.3f, 600000, 300)
				);
		
		System.out.println("find city with less area and highest population");
		List<CityStream> value=cs.stream().sorted(Comparator.comparing(CityStream::getPopulation).thenComparing(CityStream::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println("find city with high population index and high city area");
		List<CityStream> value1=cs.stream().sorted(Comparator.comparing(CityStream::getPollutionIndex).thenComparing(CityStream::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value1);
		
		System.out.println("print city with less population index first");
		List<CityStream> value2=cs.stream().sorted(Comparator.comparing(CityStream::getPollutionIndex)).collect(Collectors.toList());
		System.out.println(value2);
		
		System.out.println("print city with lowest population index and lowest area");
		List<CityStream> value3=cs.stream().sorted(Comparator.comparing(CityStream::getPollutionIndex).thenComparing(CityStream::getArea_of_city)).limit(1).collect(Collectors.toList());
		System.out.println(value3);
		
		System.out.println("count how many city in state");
		long count=cs.stream().map(CityStream::getCityname).count();
		System.out.println(count);
		
		System.out.println("total area of each state");
		long sum=cs.stream().collect(Collectors.summingLong(CityStream::getArea_of_city));
		System.out.println(sum);
		
	}

}
