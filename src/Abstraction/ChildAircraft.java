package Abstraction;

public class ChildAircraft extends Parentcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildAircraft ch= new ChildAircraft();
		ch.securitystandards();
		ch.color();

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("color of this is black");
		
	}

}
