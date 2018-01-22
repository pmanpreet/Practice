class HappyMeals{
	Burgur burgur;
     String Slice;
     Drink drink;
     KidsMeal kidmeal;
     
     void showHappyMealsDetails() {
    	 System.out.println("one"+burgur+ ",one"+drink+ "and" +kidmeal);
     }
     
}
class Burgur{
	String burName;
	int prize1;
	int quantity;
	
	void showBurgerDetails() {
		System.out.println(burName+" is" +prize1+ "only..");
	}
}
class Drink{
	String drinkName;
	String type;
	int prize2;
	
	void showDrinkDetails() {
		System.out.println(drinkName+" is "+prize2+"only..");
	}
}
class KidsMeal{
	Burgur burgur;
	String chocolate;
	Drink drink;
	
	void showKidsMealDetails() {
		System.out.println("Plz give me"+burgur+ "and" +drink);
	}
}
public class assignment1 {

	public static void main(String[] args) {
		
      HappyMeals h1 = new HappyMeals();
      
      // Burger Details
      Burgur b1 = new Burgur();
      b1.burName = "Cheese Burgur";
      b1.prize1 = 99;
      b1.quantity = 1;
      
      // Drink Details
      Drink d1 = new Drink();
      d1.drinkName = "Coke";
      d1.prize2 = 49;
      d1.type ="Cold Drink";
      
      // KidsMeal Details
      KidsMeal k1 = new KidsMeal();
      k1.burgur = b1;
      k1.chocolate = "KitKat";
      k1.drink = d1;
      
      
      //HappyMeals Details
      h1.burgur = b1;
      h1.Slice ="Apple";
      h1.drink = d1;
      h1.kidmeal = k1;
      
      
      h1.showHappyMealsDetails();
	}

}


