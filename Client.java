package Client;

import OOPS.Student;

public class Client {

	public static void main(String[] args) {
				
		// USES DEFAULT CONSTRUCTOR
		Student S = new Student();
				
		// VALUES WE ARE INSERTING
		String Address = "12 Ernest Road";
		String DOB = "June 4 ";
		String Name = "Siva";
		String State = "MA";
		String Zipcode = "35816";
			
		// USING SETTER METHODS TO INSERT
		S.setAddress(Address);
		S.setDOB(DOB);
		S.setName(Name);
		S.setState(State);
		S.setZipcode(Zipcode);
		
		// USING GETTER METHODS TO PRINT
		System.out.println(S.getName());
		System.out.println(S.getState());
		System.out.println(S.getDOB());
		System.out.println(S.getAddress());
		System.out.println(S.getZipcode());
			
		// USING CUSTOM CONSTRUCTOR
		Student S1 = new Student(Name,Address,DOB,State,Zipcode);
		
		// USING DISPLAY METHOD TO PRINT
		S1.display();
	}

}
