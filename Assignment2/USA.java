package burgerAssignment;
import taesikGUI.MenuGUI;

class USA extends Burger211 {

	USA() {
		setBurgerName();
		setTopping();
		setCal();
		setPrice();
		setPromo();
	}

	@Override
	public void printMenu(String franchise) {
		
		System.out.println(franchise + ", USA\n");
		System.out.println(NameB1 + ": " + CalB1 + "KCal " + "US$" + PriceB1);
		System.out.println(ToppingsB1);
		
		System.out.println(NameB2 + ": " + CalB2 + "KCal " + "US$" + PriceB2);
		System.out.println(ToppingsB2);
		
		System.out.println(NameB3 + ": " + CalB3 + "KCal " + "US$" + PriceB3);
		System.out.println(ToppingsB3 + "\n");
		
		String infoB1 = NameB1 + ": " + CalB1 + "Kcal" + " \\ $"+ PriceB1; 
		String infoB2 = NameB2 + ": " + CalB2 + "Kcal" + " \\ $"+ PriceB2;
		String infoB3 = NameB3 + ": " + CalB3 + "Kcal" + " \\ $"+ PriceB3;
		
		new MenuGUI(franchise, infoB1, ToppingsB1, infoB2, ToppingsB2, infoB3, ToppingsB3, PromoUSA);
	}
}