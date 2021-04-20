package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class CharacterinString {
	
	//Java Program to Count Occurrences Of Each Character In String
	
	public static void countinString(String inputstring)
	{
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		char chArr[]=inputstring.toCharArray();
		
		for(char ch:chArr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
				
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		
		
		
		for(Map.Entry<Character, Integer> set :map.entrySet())
		{
			if(set.getValue()>1)
			System.out.println(set.getKey()+" "+set.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countinString("Java is programing lanuage");

	}

}
