package topic02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTester {
	
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>(Arrays.asList(new Integer[]{1,2,3,4}));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(new Integer[]{3,4,5}));
		Set<Integer> s3 = new HashSet<>(Arrays.asList(new Integer[]{2,5,6}));
		
		s2.addAll(s3); 
		System.out.println(s2); // s2 = s2 cup s3 = {2,3,4,5,6}
		
		s2.retainAll(s1);       // s2 = s2 cap s1 = {2,3,4} 
		System.out.println(s2); // s2 = s2 cap s1 = {2,3,4} 
		
		s2.removeAll(s3);
		System.out.println(s2); // s2 = s2 minus s3 = {3,4} 
			
		s2.add(3);
		s2.add(5);
		s2.add(5);
		System.out.println(s2); // s2 = s2 cup {3,5,5} = {3,4,5} 
		
		SortedSet<Integer> s = new TreeSet<>(Arrays.asList(new Integer[]{1,3,7,2,5,4,7}));
		System.out.println(s.headSet(5));  // {1,2,3,4}
		System.out.println(s.tailSet(5));  // {5,7}
		System.out.println(s.subSet(2,5)); // {2,3,4}
	}
}
