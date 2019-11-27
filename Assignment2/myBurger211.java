package burgerAssignment;

public class myBurger211 {

	public static void main(String[] args) {
		
		Burger211 Bellevue = new USA();
		Bellevue.printMenu("Bellevue");
		
		Burger211 Seattle = new USA();
		Seattle.printMenu("Seattle");
		
		Burger211 Bogota = new Colombia();
		Bogota.printMenu("Bogota");
		
		Burger211 Medellin = new Colombia();
		Medellin.printMenu("Medellin");

	}

}
