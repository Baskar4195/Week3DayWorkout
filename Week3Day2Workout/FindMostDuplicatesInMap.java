package Week3Day2Workout;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindMostDuplicatesInMap {

	public static void main(String[] args) {
		
		 String text="abababa";
	       Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
	       char[] charArray= text.toCharArray();
	       for(char ch : charArray)
	       {
	           
	           map.put(ch, map.getOrDefault(ch,0)+1) ;   
	           }
	       System.out.println(map);
	       Set<Entry<Character,Integer>> entrySet = map.entrySet();
	       int maxOccurrence=0;
	       char Key=0;
	       for(Entry<Character,Integer>entry: entrySet) {
	           
	       //if(value>0)
	           if(entry.getValue()>maxOccurrence)
	       {
	           Key=entry.getKey();
	           maxOccurrence=entry.getValue();
	       }
	           Key=entry.getKey();
	           maxOccurrence=entry.getValue();
	       
	       }
	       System.out.println("no of occurence"+  maxOccurrence);
	       System.out.println("character"+"  " + Key);
	          		
		/* input: abbaba
		 * output: b
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
	}

}
