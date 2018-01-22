class User{
	//Attributes
	String name;
	private String phone;
	String email;
	int age;
	char gender;
	String address;
	 
	
	//Setter Method | Write the data in phone
	void setPhone(String p) {
		phone = p;
	}
	// Getter Method | Read the data from phone
	String getPhone() {
		return phone;
	}
}
public class session5 {

	public static void main(String[] args) {
	// Object Construction Statement
      User u1 = new User();
      User u2 = new User();
       User u3 = u1; //Reference Copy
      
      
      System.out.println("u1 is: "+u1);
      System.out.println("u2 is: "+u2);
      
      
      //Write the data in object
      u1.name = "manpreet";
     // u3.phone = "+91 8437109239";
      u3.setPhone("+91 84371092389");
      u1.email = "bangermanpret@gmail.com";
      u1.age = 20;
      u1.gender = 'f';
      u1.address = "lalton kalan";
      
      
      
      
      u2.name = "mandeep";
     // u2.phone = "+91 8437672396";
      u2.setPhone("+91 8437672396");      
      u2.email = "mandeep@gmail.com";
      u2.age = 24;
      u2.gender = 'f';
      u2.address = "dulay";
      
      
      //Read the data from object
   //   System.out.println(u1.name +" is " +u1.age+ "years old and can be contacted at "+u3.phone);
     //System.out.println(u2.name+" is " +u2.age+" years old and can be contacted at"+u2.phone);	
      System.out.println(u1.name +" is " +u1.age+ "years old and can be contacted at "+u3.getPhone());
      System.out.println(u2.name+" is " +u2.age+" years old and can be contacted at"+u2.getPhone());	
      
     
    
	}

}
