package Collection;

import java.util.HashSet;
import java.util.Iterator;

import javax.sound.midi.Synthesizer;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set= new HashSet<String>();
set.add("Ankit");
set.add("mangla");
set.add("Piyush");
set.add("Sharma");

set.add("Deepak");




System.out.println("Set value before addition of another set"+ set);

set.remove("Deepak");
HashSet<String> set1= new HashSet<String>();

set1.add("Ritika");
set1.add("Mangla");

set1.add("Ankit");


set.addAll(set1);

System.out.println(set.size());

System.out.println("Set value after addition of another set"+ set);

set.retainAll(set1);
Iterator<String> itr=set.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}


/*for(String ar: set)
{
	System.out.println(ar);
}
*/

System.out.println(set.size());

	}

}
