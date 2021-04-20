package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Con_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<String>();
		set.add("Ankit");
		set.add("mangla");
		set.add("Piyush");
		set.add("Sharma");

		set.add("Deepak");
		
		ArrayList<String> list= new ArrayList<>(set);
		Iterator<String> li=list.iterator();
		System.out.println(list.get(1));
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		

	}

}
