package Interface;

public class IndianTraficeClass implements CentralTraffice {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		IndianTraficeClass ind= new IndianTraficeClass();
		
		ind.redLight();
		
		ind.yellowlight();
		
		ind.greenlight();
		ind.walkonroad();

	}

	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		
		System.out.println("Need to stop when red light is on");
		
	}

	@Override
	public void greenlight() {
		// TODO Auto-generated method stub
		
		System.out.println("movement is allowed when lights are in green mode");
		
	}

	@Override
	public void yellowlight() {
		// TODO Auto-generated method stub
		
		System.out.println("you need to stop once red light will come and yellow wil go ");
		
	}
	
	public void walkonroad()
	{
		System.out.println("We can walk on rod sucessfully");
	}

}
