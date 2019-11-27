import java.util.*;

public class Stack {

	static int NumberOfEquations = 7;
	static String[] myEquations = new String[NumberOfEquations];
	static HashMap<Integer, String> errors = new HashMap<>();
	static HashMap<Character, Character> pairs = new HashMap<>();

	public static void main(String[] args) {

		setErrorMessage();
		setPair();

		myEquations[0] = "1*(2+3)*(4+5)";
		myEquations[1] = "{(5=2)-(3/7)}";
		myEquations[2] = "9/(3-1)+{5*3)";
		myEquations[3] = "/1+3*{2-1)}";
		myEquations[4] = "1*2+3*4-5";
		myEquations[5] = "+4*5-3+7";
		myEquations[6] = "3+6*(5/0)";

		for (int i = 0; i < myEquations.length; i++) { // Statements (infix) to be evaluated
			Stack211 st = new Stack211();

			System.out.println(myEquations[i]);
			System.out.println();

			for (int j = 0; j < myEquations[i].length(); j++) { // Read tokens one by one.
				char c = myEquations[i].charAt(j);
				if (c == '(' || c == '{') {
					st.push(c);
				}
				if (c == ')' || c == '}') {
					char popC = (char) st.pop();
					if (popC != pairs.get(c)) {
						printError(j, 1);
					}
				}
				if (c == '0') {
					printError(j, 3);
				}

			}
		}
	}

	public static void setErrorMessage() {

		errors.put(1, "Syntax error: Incomplete Expression: Unpaired.");
		errors.put(3, "Syntax error: Can't divide number by 0.");
		errors.put(4, "Syntax error: Token can't be verified.");
	}

	public static void setPair() {
		pairs.put(')', '(');
		pairs.put('}', '{');
		pairs.put('+', '+');

	}

	public static void printError(int location, int ErrorNumber) { // print some empty spaces
		for (int i = 0; i < location; i++) {
			System.out.print(" ");
		}
		System.out.println("^");
		errors.get(ErrorNumber);
		System.out.println(errors.get(ErrorNumber));
		System.out.println();

	}
}
