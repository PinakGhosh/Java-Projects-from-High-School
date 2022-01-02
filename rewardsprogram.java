class Customer {
	
	private static int COUNT = 1;

	int intCustomerID;
	private int intNumberOfPoints;
	private String strDateOfBirth, strEmail, strPhone,strFirstName, strLastName;

	public String getFirstName(){
		return strFirstName;
	}
	public void setFirstName(String fNameIn){
		strFirstName =  fNameIn;
	}
	
	public String getLastName(){
		return strLastName;
	}
	public void setLastName(String lNameIn){
		strLastName =  lNameIn;
	}
	
	public String getDateOfBirth(){
		return strDateOfBirth;
	}	
	public void setDateOfBirth(String dobIn){
		strDateOfBirth = dobIn;
	}

	public String getEmail(){
		return strEmail;
	}
	public void setEmail(String emailIn){
		strEmail = emailIn;
	}

	public String getPhone(){
		return strPhone;
	}
	public void setPhone(String phoneIn){
		strPhone = phoneIn;
	}

	public int getPoints(){
		return intNumberOfPoints;
	} 
	public void setPoints(int pointsIn){
		intNumberOfPoints = pointsIn;
	}

	public int getID() {
		return intCustomerID;
	}

	void addPoints(int pointsIn){
		System.out.println(strFirstName + " " + strLastName + " made a purchase of " + pointsIn + "$");
		intNumberOfPoints = intNumberOfPoints = pointsIn;
		System.out.println(strFirstName + " " + strLastName + " now has" + intNumberOfPoints + " points");
	}

	void printInfo(){
		System.out.println("ID: " + intCustomerID);
		System.out.println("Name: " + strFirstName + " " + strLastName);
		System.out.println("D.O.B: " + strLastName);
		System.out.println("Email: " + strEmail);
		System.out.println("Phone: " + strPhone);
		System.out.println("Points: " + intNumberOfPoints);
	}


  public Customer(String fNameIn, String lNameIn, String dobIn, String emailIn, String phoneIn){
   strFirstName = fNameIn;
   strLastName = lNameIn;
   strDateOfBirth = dobIn;
   strEmail = emailIn;

   intNumberOfPoints = 0;

   intCustomerID = COUNT++;
   System.out.println("Creating a new Customer with id=" + intCustomerID);
  }
}

public class RewardsTester {
	public static void main(String[] args){
		Customer customer1 = new Customer("Harry","Potter","July 31, 1980", "harrypotter@hogwarts.com", "1-506-444-4444");
		
	}

}

