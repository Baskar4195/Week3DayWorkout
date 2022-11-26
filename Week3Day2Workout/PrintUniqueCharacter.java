package Week3Day2Workout;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String Name = "baskar";
		char[] name = Name.toCharArray();
		Set<Character> user = new HashSet<Character>();

		for (int i = 0; i < name.length; i++) {
			boolean dupName = user.add(name[i]);
			if (!dupName) {
				user.contains(name[i]);
				user.remove(name[i]);
			} else {
				user.add(name[i]);
			}

		}
		System.out.println(user);

		// PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input b) Print all unique characters only (any order)
		 * 
		 * Input: babu Output: a u
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array b) Create a new Set -> HashSet c) Add
		 * each character to the Set and if it is already there, remove it d) Finally,
		 * print the set
		 * 
		 */
	}

}
