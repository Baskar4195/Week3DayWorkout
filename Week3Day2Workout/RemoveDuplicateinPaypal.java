package Week3Day2Workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateinPaypal {

	public static void main(String[] args) {
		
		String Name= "Paypal India";
		String name= Name.replaceAll("\\s", "");
		String CompanyName =name.toLowerCase();
		char[] Companyname= CompanyName.toCharArray();
		Set<Character> BrandName= new LinkedHashSet<Character>();
		Set<Character> Brandname= new LinkedHashSet<Character>();
		for(int i=0; i< Companyname.length;i++)
		{
			boolean add =BrandName.add(Companyname[i]);
			if (!add)
			{
				BrandName.contains(Companyname[i]);
				Brandname.add(Companyname[i]);
			}
			
		} //System.out.println(dupCharSet);
		BrandName.removeAll(Brandname);
		System.out.println(BrandName);
		
//		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
	}

}
