public class Postfix {

	static String[] myEquations = { "1*(2+3)*(4+5)", "2+(8-4)+6" };
	

	public static void main(String[] args) {
		for (int i = 0; i < myEquations.length; i++) {
			Calculation(myEquations[i]);
		}
	}

	public static void Calculation(String x) {
		// Statements (infix).
		Stack211 st = new Stack211();

		String post = "";

		System.out.println("Infix equation: " + x);
		System.out.print("Postfix conversion: ");

		for (int j = 0; j < x.length(); j++) { // Read tokens one by one.
			char c = x.charAt(j);
			if (c <= '9' && c >= '0') {
				post = post + c;
			} else if (st.isEmpty() == true && (c == '+' || c == '-' || c == '*' || c == '/')) {
				st.push(c);
			} else if (c == '(') {
				st.push(c);
			} else if (c == ')') {
				while (st.isEmpty() == false && (char) st.myStack.get(st.stackTop) != '(') {
					post = post + st.pop();
				}
				st.pop();
			} else {
				while (st.isEmpty() == false && Precedence(c) <= Precedence((char) st.myStack.get(st.stackTop))) {
					post = post + st.pop();
				}
				st.push(c);
			}
		}
		while (st.isEmpty() == false) {
			post = post + st.pop();
			System.out.println(post);
			System.out.println();
		}

	}

	public static int Precedence(char operator) {
		switch (operator) {
		case '-':
		case '+':
			return 1;

		case '*':
		case '/':
			return 2;

		case '(':
			return 0;
		}
		return -1;
	}
}
