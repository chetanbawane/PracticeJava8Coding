package java8Coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(55,88,48,78,4,5,8,11,9,89,17,11,4);
		
		//list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
		
		List<String> l1=list.stream().map(t->t + "").filter(t->t.startsWith("1")).collect(Collectors.toList());
		//System.out.println(l1);

		// Find Duplicates 
		Set<Integer> set= new HashSet<>();
		List<Integer> l2=list.stream()
			.filter(t-> !set.add(t))
				.collect(Collectors.toList());
		System.out.println(l2);
	}

}
