package burgerAssignment;
import taesikGUI.MenuGUI;


class Colombia extends Burger211 {

	Colombia() {
		setBurgerName();
		setTopping();
		setCal();
		setPrice();
		setPromo();
	}

	
	@Override
	public void printMenu(String franchise) {
	
		PriceB1 = PriceB1*3257.80;
		PriceB2 = PriceB2*3257.80;
		PriceB3 = PriceB3*3257.80;
		
		System.out.println(franchise + ", USA\n");
		System.out.println(NameB1 + ": " + CalB1 + "KCal " +  "(Was COP$" + PriceB1 + ") Now COP$" + PriceB1*0.5);
		System.out.println(ToppingsB1);
		
		System.out.println(NameB2 + ": " + CalB2 + "KCal " + "(Was COP$" + PriceB2 + ") Now COP$" + PriceB2*0.5);
		System.out.println(ToppingsB2);
		
		System.out.println(NameB3 + ": " + CalB3 + "KCal " + "(Was COP$" + PriceB3 + ") Now COP$" + PriceB3*0.5);
		System.out.println(ToppingsB3 + "\n");

		String infoB1 = NameB1 + ": " + CalB1 + "Kcal" + " \\ Was $" + PriceB1 + ", Now $"+ PriceB1*0.5; 
		String infoB2 = NameB2 + ": " + CalB2 + "Kcal" + " \\ Was $" + PriceB2 + ", Now $"+ PriceB2*0.5;
		String infoB3 = NameB3 + ": " + CalB3 + "Kcal" + " \\ Was $" + PriceB3 + ", Now $"+ PriceB3*0.5;
		
		new MenuGUI(franchise, infoB1, ToppingsB1, infoB2, ToppingsB2, infoB3, ToppingsB3, PromoColombia);
	}

}