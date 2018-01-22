// VOID USES FOR NO ACK NEEDED
public class Methods {
     // Non Static Methods
	void sayHello() {
		System.out.println("Hello, This is a non static  method!!.");
		System.out.println("Hello, Its great day");
		System.out.println("Do something meaningful today..");
		
	}
	//Static Method
	static void sayHelloAgain() {
		System.out.println("Hello, This is a static  method!!.");
		System.out.println("Hello, Its great day");
		System.out.println("Do something meaningful today..");
	}
	   void addNums(String name, int n1 , int n2 ) {
		   int n3 = n1+n2;
		   System.out.println("Dear,"+name+ " n3 is "+n3);
	   }
	   
	  float calculateAreaOfCircle (float radius) {
		  float area =3.14f	* radius * radius;
		  String str = "John, Area is:" +area;
		  System.out.println("Calculate Area for "+radius+ " is");
		  return area;  //Ack
	  }
		  static void printTable(int num) {
			  for(int i=1;i<=10;i++) {
				  System.out.println(num +" " +i+" 's are "+(num*i));
				  
			  }
				  
		  }
	  
	   
	
	public static void main(String[] args) {
		
         //To Execute Non Static Method , Create an object
		Methods mRef = new Methods();
		mRef.sayHello();// Calling or Execute Method
		mRef.addNums("Manpreet",10,20);
		mRef.addNums("Mandeep", 20, 30);
		
		
		float result = mRef.calculateAreaOfCircle(2.2f);
		System.out.println("Result is:"+result);
		
		
		Methods.printTable(5);
	}

} 
