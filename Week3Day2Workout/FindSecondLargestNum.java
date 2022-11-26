package Week3Day2Workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		
		int[] Num = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer>largestNum= new TreeSet<Integer>();
		for (int i = 0; i < Num.length; i++) {
			largestNum.add(Num[i]);
		}
		java.util.List<Integer> FindSecondlargestNum = new ArrayList<Integer>(largestNum);
		Collections.sort(FindSecondlargestNum);
		
		System.out.println(FindSecondlargestNum.get(FindSecondlargestNum.size()-2));
		
		// Here is the input
				
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */	}

}
