package java8Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoPractice {

	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(55,88,48,78,4,5,8,11,9,89,17,11,4,1022);

		// Given a String, find the first non-repeated character in it using Stream functions?
		
				String str= "find the first non repeating character in given string";
				
				char output= str.chars()
							.mapToObj(ch->(char)ch)
							.filter(ch-> str.indexOf(ch)==str.lastIndexOf(ch))
							.findFirst()
							.orElse(null);
				
							System.out.println(output);
				
			   
				//Given a String, find the first repeated character in it using Stream functions?
							
							
							String str1= "find the first non repeating character in given string";
							
							char output1= str.chars()
										.mapToObj(ch->(char)ch)
										.filter(ch-> str.indexOf(ch)!=str.lastIndexOf(ch))
										.findFirst()
										.orElse(null);
							
										System.out.println(output1);
				
				//Given a list of integers, sort all the values present in it using Stream functions?
										
					List<Integer> l1= list.stream().sorted().collect(Collectors.toList());
					
					System.out.println(l1);
				
				//Given a list of integers, sort all the values present in it in descending order using Stream functions?
                    
					List<Integer> l2= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
					
					System.out.println(l2);
	}

}
