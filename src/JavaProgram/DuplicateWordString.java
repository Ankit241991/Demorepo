package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordString {
	// This  program will give the count of duplicate words
	
	public static void duplicateWord(String inputstring)
	{
		
		String  words[]= inputstring.split(" ");
		Map<String,Integer> wordcount=  new HashMap<String, Integer>();
		
		for(String word:words)
		{
			if (wordcount.containsKey(word))
			{
				int count=wordcount.get(word);
				
			
				wordcount.put(word, count+1);
			}
			
			else
			{
				wordcount.put(word, 1);
			}
			
		}
		
		//extracting all keys of map- wordcount
		
		Set<String> wordinString= wordcount.keySet();
		
		for(String word:wordinString)
		{
			if (wordcount.get(word)>1)
			{
				System.out.println(word+":"+ wordcount.get(word));
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateWord("java is programing lanuage and Java is created by java java");

	}

}
