package haftom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		String[] names = {
				"Haftom", "Mesfin"
		};
		
		Arrays.stream(names)  
			  .forEach(System.out::println);
		
		Integer[][] numbers = new Integer[][] {
				{1,2,3}, {4,5}
		};
		Arrays.stream(numbers)
		      .forEach(System.out::println);
		
		Arrays.stream(numbers)
		      .flatMap(x->Arrays.stream(x))
		      .forEach(System.out::println);
		
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6,7));
		
		listOfLists.stream().forEach(System.out::println);
		
		listOfLists.stream()
		           .flatMap(x->x.stream())
		           .forEach(System.out::println);
		
		List<Integer> afterFlatMap = listOfLists.stream()
				                                .flatMap(x->x.stream())
				                                .collect(Collectors.toList());
		System.out.println(afterFlatMap);
	}
}
