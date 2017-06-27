package OOPS;

public class Student {
	private String Name;
	private String Address;
	private String DOB;
	
	private String State;
	private String Zipcode;
	
	// CONSTRUCTOR CLASS
	
	public Student(String Name, String Address, String DOB, String State, String Zipcode) {
		super();
		
		//System.out.println("You are inside custom constructor class");
		
		this.Name = Name;
		this.Address = Address;
		this.DOB = DOB;
		this.State = State;
		this.Zipcode = Zipcode;
	}
	
	// PRINTS VALUES INSIDE CLASS
	public void display(){
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(DOB);
		System.out.println(State);
		System.out.println(Zipcode);
	}
	
	
	// GETTER AND SETTER METHODS
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getZipcode() {
		return Zipcode;
	}
	
	public void setZipcode(String Zipcode) {
		this.Zipcode = Zipcode;
	}
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	
	
}
