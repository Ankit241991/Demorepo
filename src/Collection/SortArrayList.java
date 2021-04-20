package Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr= new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(6);
		arr.add(20);
		arr.add(30);

		Collections.sort(arr);
		
	Iterator<Integer> in=	arr.iterator();
	
	while(in.hasNext())
	{
		System.out.println(in.next());
	}
		
	/*for(int num: arr)
	{
		System.out.println(num);
	}
	*/
	
/*	for (int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i));
	}*/
		
		
	}

}
