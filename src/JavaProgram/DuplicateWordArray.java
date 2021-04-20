package JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String words[]= {"Java","Perl","JavaScript","C","VBscript","Java","C","Perl"};

//1st method by for loop
// this method is very worst method because its complexity is O(n*n)
/*for(int i=0;i<words.length;i++)
{
	for(int j=i+1;j<words.length;j++)
	{
		if(words[i].equalsIgnoreCase(words[j]))
		{
			System.out.println("duplicate element is " + words[i]);
		}
	}
}*/

// 2nd by hashset


Set<String> set= new HashSet<>();
for(String word:words)
{
if(set.add(word)==false)
{
	System.out.println("Duplicate element is " +word);
}
}

/*Map<String, Integer> map= new HashMap<>();

for(String word:words )
{
	Integer count=map.get(word);
	if(count == null)
	{
		map.put(word, 1);
	}
	
	else 
	{
		map.put(word, ++count);
	}
}



for(Map.Entry<String, Integer> map1 :map.entrySet())
{
	if (map1.getValue()>1)

	{
		System.out.println(map1.getKey()+ ":" + map1.getValue());
	}
	
}*/

	}

}
