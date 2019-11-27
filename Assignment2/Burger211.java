// Manuela Dorado Novoa
// email: manuela.dorado@bellevuecollege.edu
// Student ID: 950-676-905
// May 7, 2019
// This program tests my knowledge of inheritance, polymorphism, overriding, encapsulation, abstract class and construction. 



package burgerAssignment;
public abstract class Burger211 {

	protected static String NameB1, NameB2, NameB3;
	public double PriceB1, PriceB2, PriceB3;
	protected String ToppingsB1, ToppingsB2, ToppingsB3;
	public int CalB1, CalB2, CalB3;
	public String PromoColombia, PromoUSA;

	Burger211() {
		setBurgerName();
		setTopping();
		setCal();
		setPrice();
		setPromo();
	}

	public abstract void printMenu(String franchise);

	public static void setBurgerName() {
		NameB1 = "Inheritance Burger";
		NameB2 = "Overriding Burger";
		NameB3 = "Polymorphism Burger";
	}

	public void setTopping() {
		ToppingsB1 = "beef patty, tomato, onion, ranch source";
		ToppingsB2 = "beef patty, lime, onion, lettuce, tomato sauce";
		ToppingsB3 = "gallo, onion, ranch source";
	}

	public void setCal() {
		CalB1 = 371;
		CalB2 = 303;
		CalB3 = 505;
	}

	public void setPrice() {
		PriceB1 = 12.50;
		PriceB2 = 14.75;
		PriceB3 = 11.00;
	}
	
	public void setPromo() {
		PromoColombia = "Independence Day Celebration! July 20th gives you 50% off!";
		PromoUSA = "Enjoy the best burger in town!";
	}
}






