package Week3Day2Workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharInSet {

	public static void main(String[] args) {
		String companyName = "google";
		char [] array = companyName.toCharArray();
		Set<Character> uniquechar = new LinkedHashSet<Character>();
		for (int i = 0; i < array.length; i++) {
			uniquechar.add(array[i]);
		}System.out.println(uniquechar);
	}

}
