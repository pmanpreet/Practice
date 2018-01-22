class Person{
String name;
byte age;
char gender;
Address address;
String qualification;
int dob;
Job job;

      //Method
   void showPersonDetails() {
	   System.out.println("Person Details");
	   System.out.println(name+"is"+age+"years old and is"+qualification+ "in qualification");
	   System.out.println("Address Details");
	   address.showAddressDetails();
	   System.out.println("Job Details");
	   job.showJobDetails();
	   
   }
}

class Address{
	String adrline;
	String city;
	String State;
	int zipCode;
	
	void showAddressDetails() {
		System.out.println(adrline+"is in"+city+"having zipcode"+zipCode);
	}
}
class Job{
	String compName;
	int salary;
	String designation;
	 
	void showJobDetails() {
		System.out.println(designation+"receives salary of \u20b9"+salary+"in"+compName);
		
	}
}
public class ComplexObj {

	
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("p1 is:-"+p1);
		
		
		Address a1 = new Address();
		System.out.println("a1 is :-"+a1);
		
		// Write data in address object
		a1.adrline = "Country Homes";
		a1.city = "ludhiana";
		a1.State = "punhab";
		a1.zipCode = 142022;
		
		
		
		//job details
		Job j1 = new Job();
		j1.compName ="Auribies";
		j1.designation ="Ludhiana";
		j1.salary = 15000;
		
		
		//Person Details
		p1.name ="jack";
		p1.age = 30;
		p1.gender = 'M';
		p1.qualification ="Masters";
		p1.dob = 13/03/1987;
		
		
		//Person Has an Relation
		p1.job =j1; //Reference copy
		p1.address = a1;
		
		p1.showPersonDetails();
	}

}
