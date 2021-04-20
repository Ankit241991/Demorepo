package Collection;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Map<Integer, String> map= new java.util.LinkedHashMap();
		
		map.put(1, "Ankit");
		map.put(2, "Mangla");
		map.put(4, "Payal");
		map.put(null, "devansh");
		map.put(1, "Deepak");
		map.put(5, "Payal");
		
		map.remove(1);
		map.replace(2, "Ayushi");
		
		for(Map.Entry<Integer, String> map1:map.entrySet())
		{
			System.out.println(map1.getKey()+""+map1.getValue());
		}

	}

}
