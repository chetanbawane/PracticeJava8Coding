package java8Coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(55,88,48,78,4,5,8,11,9,89,17,11,4,1022);
		
		//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		//list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
		
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		List<String> l1=list.stream().map(t->t + "").filter(t->t.startsWith("1")).collect(Collectors.toList());
		//System.out.println(l1);

		//  How to find duplicate elements in a given integers list in java using Stream functions?
		Set<Integer> set= new HashSet<>();
		List<Integer> l2=list.stream() 
			.filter(t-> !set.add(t))
				.collect(Collectors.toList());
		//System.out.println(l2);
		
		//Given the list of integers, find the first element of the list using Stream functions?
		
		//System.out.println(list.stream().findFirst());
		
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		int count= (int) list.stream().count();
		//System.out.println(count);
		
		//Given a list of integers, find the maximum value element present in it using Stream functions?
		
		Optional<Integer> maxno= list.stream().sorted(Comparator.reverseOrder()).findFirst();		
		//System.out.println(maxno);
		
		
		
		//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
		int[]arr= {5,8,7,1,4,89,45,7,2,8,6,39,21};
		Arrays.stream(arr).sorted().forEach(t->System.out.println(t));
		
		//How to use map to convert object into Uppercase in Java 8?
		
		List<String> list1=Arrays.asList("chetan","janardhan","bawane");
		list1.stream().map(t->t.toUpperCase()).forEach(t->System.out.println(t));
		
		
		
		//How to count each element/word from the String ArrayList in Java8?
		//System.out.println(list1.stream().count());

		Map<String, Long> map= list1.stream()
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(map);
		
		//How to find only duplicate elements with its count from the String ArrayList in Java8?
		Set<Integer> set1=new HashSet<>();
		Map<Integer, Long>map1=
		list.stream().filter(t->Collections.frequency(set1, t)>1)
											.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(map1);
		
		//1. Write a Java program to calculate the average of a list of integers using streams.

		//System.out.println(list.stream().mapToInt(t->t.intValue()).average());
		
		//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

		//list1.stream().map(t->t.toUpperCase()).forEach(t->System.out.println(t));
		
		//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		
		int sum=list.stream().filter(t->t%2==0).collect(Collectors.summingInt(t->t));
		System.out.println(sum);
		System.out.println(list.stream().filter(t->t%2!=0).mapToInt(Integer::intValue).sum());

		
		
		
	}

	
}
