package Car;

import Vehicle.automobile;

public class car extends automobile{

	private String caryear;
		
	public car() {
		// DEFAULT CONSTRUCTOR
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String name="Hyundai";
		String model="i10 Sportz";
		String year="2010";
		
		automobile a= new automobile(name,model,year);
		a.display();
		
		car c = new car();
		c.caryear = Year;
		System.out.println("This is protected member of Automobile changed using Static - Car Year:" + c.caryear);
	}

}
