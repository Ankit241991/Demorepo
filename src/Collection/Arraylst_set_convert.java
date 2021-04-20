package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Arraylst_set_convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String > ar= new ArrayList<String >();
		ar.add("Ankit");
		ar.add("Abhishek");
		ar.add("Parul");
		ar.add(1, "Mangla");
		ar.add(3, "Sharma");
		
		HashSet<String> s= new HashSet<String>(ar);
		
		for(String str:s)
		{
			System.out.println(str);
		}
	}

}
