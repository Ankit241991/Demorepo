
 class Animal {

	 
		void eat(){System.out.println("I am eating legpiece in animal class");}  
		}  
		class Dog extends Animal{  
		void bark(){System.out.println("barking...");}  
		
		void weep() {
			System.out.println(" I am into weep dog class");
		}
		
		void eat() {
			System.out.println(" I am eating legpiece in dog class");
		}
		}  
	
		
		public class Inheritance{
			
	
			
		public static void main(String args[]){  
		//Dog d=new  BabyDog(); 
			Animal d= new Dog();
			
			 
			d.eat();  
		}
		}

