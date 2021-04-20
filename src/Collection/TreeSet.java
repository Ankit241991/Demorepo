package Collection;

import java.util.Iterator;
import java.util.NavigableSet;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	java.util.TreeSet<String> a1= new java.util.TreeSet<>();
		  a1.add("Ravi");  
		  a1.add("Vijay");  
		  a1.add("Ravi");  
		  a1.add("Ajay");  
		  a1.add("Ankit");
		  a1.add("Mangla");
		  a1.pollFirst();
		  String fir=a1.first();
		  
		//  
		  
		 System.out.println(a1.descendingSet());
		  
		/* // Iterator itr=a1.descendingIterator();
		  while(itr.hasNext())
		  {
			  
			  System.out.println("Value which are coming in decending order    " +itr.next());
		  }*/
		
		 
		  //Traversing elements  
		  
		  System.out.println("The First element is " + fir);
		 
		  
		  for (String str:a1)
		  {
			  System.out.println("Value after String are   " + str);
		 }  
	

	}

}
