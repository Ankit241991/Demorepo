package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList< String> ar= new ArrayList<>();

ar.add("Ravi");
ar.add("Viswa Kant");

ar.add("Mohit");
ar.add("Surya");

ArrayList<String> ar1= new ArrayList<>();

ar1.add("Ravi");
ar1.add("Mohit");
ar1.add("Ankita");

ar1.add("Chander");


//ar.retainAll(ar1);

Iterator<String> itr=ar.iterator();

while(itr.hasNext())
{
	
	 {
		 System.out.println(itr.next());
	 }
	
}

/*
for(String str: ar) {
	System.out.println(str);
}*/
	}

}
