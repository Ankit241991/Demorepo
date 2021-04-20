
public class String_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sub="Ankit Mangla";
		
		String trim= "  Ankit Mangla    ";
		
		System.out.println(sub.substring(1));;
		
		String st1=sub.substring(6, 12);

		
		System.out.println(st1);
		//trim function will remove the white space before and after the string
		
		System.out.println("Trim output is "+ trim.trim());
		
		char ch=sub.charAt(5);
		
		System.out.println(ch);
		// char ch1= sub.charAt(15);
		 
		 //System.out.println(ch1);
		 
		 // Replacement exam in string class
		 String replace ="My name is Ankit Mangla and i am working as a software enginner";
		 
		 String replaced =replace.replace("Ankit","Aayushi");
		 
		 System.out.println("String after replacement is "+replaced);
		 
		 
		 String Str="Lasha";
		 
		 System.out.println(Str.startsWith("La"));
		 
		 
		 System.out.println(Str.endsWith("he"));
		 
		 
		 //use of concat method
		 
		 String con= "Ankit";
		 
		 String con1="Mangla";
		 
		 String concat= con.concat("Sharma");
		 
		 System.out.println(concat);
		 
		 
		 String concat1="Ankit"+con1;
		 
		 System.out.println(concat1);
		 
		 
		
	}

}
