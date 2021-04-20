package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String > ar= new ArrayList<String >();
		ar.add("Ankit");
		ar.add("Abhishek");
		ar.add("Parul");
		ar.add(1, "Mangla");
		ar.add(3, "Sharma");
		
		Iterator<String> itr =ar.iterator();
		
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		
		ArrayList<String > ar1= new ArrayList<String >();
		ar1.add("Payal");
		ar1.add("Devansh");
		ar1.add("Puneet");
		ar1.add(1, "Verma");
		ar1.add(3, "Sood");
		ar1.add("Sony");
		
		System.out.println(ar1.size());
		ar1.remove(4);
		ar1.remove("Sony");
		
		ar1.add("Payal");
		
		//ar1.clear(); it will clear all the data present in array list
		// use of get(index) is ,will gice the method value
		ar1.get(0);
		
		System.out.println("value with get index is "+ ar1.get(4));
		
		
		if (ar1.contains("Devans12"))
		{
			System.out.println("yes value is presnt");
		}
		else
		{
			System.out.println("value is not present");
		}
		
		for(String str: ar1)
		{
			System.out.println(str);
		}
		
		int inde=ar1.indexOf("Devansh");
		System.out.println("Index of devansh is  " +inde);
	
	}

}
