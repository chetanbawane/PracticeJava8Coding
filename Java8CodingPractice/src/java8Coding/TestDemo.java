package java8Coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
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
		
		System.out.println(list.stream().findFirst());
		
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		int count= (int) list.stream().count();
		//System.out.println(count);
		
		//Given a list of integers, find the maximum value element present in it using Stream functions?
		
		Optional<Integer> maxno= list.stream().sorted(Comparator.reverseOrder()).findFirst();		
		System.out.println(maxno);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
