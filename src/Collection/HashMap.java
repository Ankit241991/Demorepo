package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map= new java.util.HashMap<>();
		
		map.put(1, "Ankit");
		map.put(2, "Mangla");
		map.put(3, "Indu");
		map.put(4, "Payal");
		map.put(null, "devansh");
		map.put(1, "Deepak");
		map.put(5, "Hitesh");
		map.put(6, "Akhilesh");
		
		Set value=map.entrySet();
	java.util.Iterator itr=value.iterator();
		while(itr.hasNext())
		{
	Map.Entry<Integer, String>	map1 =	(Map.Entry<Integer, String>)itr.next();
	
	System.out.println(map1.getKey()+"Key is " + map1.getValue());
		}
		
	Map<Integer, String> map2= new java.util.HashMap<>();
		
		map2.put(1, "Mehak");
		map2.put(2, "Aakansha");
		map2.put(4, "Indrajeet");
		map2.put(null, "priyesh");
		map2.put(1, "Gagnesh");
		
		map.put(7, "Indu");
		
		
		map2.putIfAbsent(5, "Karni");
		System.out.println(map2);
		map.putAll(map2);
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+""+ m.getValue());
		}
		
	/*	Set set1=map.entrySet();
		
		java.util.Iterator itr1=set1.iterator();
		
		while(itr1.hasNext())
		{
		Map.Entry<Integer, String> str4=	(Entry<Integer, String>) itr1.next();
		
		System.out.println("the key is" +str4.getKey()+ "Value are "+ str4.getValue());
		}
		*/

	}

}
