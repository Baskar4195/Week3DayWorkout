package Week3Day2Workout;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbersinSet {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,7,3,4,8,9,10};
	Set<Integer>sum= new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			sum.add(num[i]);
			
		}		System.out.println(sum);
		for (int j = 0; j < sum.size(); j++) {
			if (!sum.contains(j)) {
				System.out.println(j);
		}
		}
	}
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
	}

