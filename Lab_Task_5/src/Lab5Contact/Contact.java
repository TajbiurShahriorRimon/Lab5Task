package Lab5Contact;

	public class Contact {
		private String personName;
		private String personId;
		private int age;
		private String mobileNumber;
		private char gender;
	
	public Contact(String personName, String personId, int age, String mobileNumber, char gender) {
		//super();
		this.personName = personName;
		this.personId = personId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	
	public Contact(){
	
	}
	
	
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonId() {
		return personId;
	}
	
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	void showPersonInfo(){
		System.out.println(personName+" " +personId+" " +age + " " +mobileNumber+ " " +gender);
	}
	public void detectMobileOperator(){
		if(mobileNumber.startsWith("017")){
			System.out.println("GP");
		}
		else if(mobileNumber.startsWith("018")){
			System.out.println("Robi");
		}
		else if(mobileNumber.startsWith("019")){
			System.out.println("BanglaLink");
		}
	}
}

	
	
	

